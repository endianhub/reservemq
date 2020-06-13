package com.xh.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.xh.order.dao.rep.OrderInfoRepDao;
import com.xh.order.entity.OrderInfo;
import com.xh.order.service.OrderInfoService;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/9
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Resource
    private JmsTemplate jmsTemplate;
    @Resource
    private OrderInfoRepDao orderRepDao;

    @Transactional
    @Override
    public void add(OrderInfo order) {
        orderRepDao.save(order);
        String message = JSON.toJSONString(order);
        // 生产者 - 向库存系统、物流系统发布消息
        jmsTemplate.convertAndSend(new ActiveMQTopic("active.order.topic.msg"), message);
    }

    @Override
    public List<OrderInfo> findAll() {

        return orderRepDao.findAll();
    }
}
