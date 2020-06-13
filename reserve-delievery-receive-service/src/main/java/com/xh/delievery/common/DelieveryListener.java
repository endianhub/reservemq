package com.xh.delievery.common;

import com.alibaba.fastjson.JSON;
import com.xh.delievery.dto.OrderInfo;
import com.xh.delievery.entity.Delievery;
import com.xh.delievery.service.DelieveryService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Title: 消费者
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
@Component
public class DelieveryListener {

    @Resource
    private DelieveryService delieveryService;

    @JmsListener(destination = "active.order.topic.msg", containerFactory = Cons.TOPIC_LISTENER)
    public void topicOrder(String message) {
        System.out.println("message = " + message);
        OrderInfo order = JSON.parseObject(message, OrderInfo.class);
        Integer count = 0;
        if (order != null) {
            System.out.println("Receive:队列：queueWuLiu1 商品名字：" + order.getProductName() + ",商品购买数量：" + order.getBuyCount());

            Delievery delievery = new Delievery();
            delievery.setOrderId(order.getOrderId());
            delievery.setUserId(order.getUserId());
            delievery.setDelievery(order.getDelivery());
            delievery.setCreateTime(new Date());
            delieveryService.add(delievery);
        }
    }

}
