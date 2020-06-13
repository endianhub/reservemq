package com.xh.product.common;

import com.alibaba.fastjson.JSON;
import com.xh.product.dto.OrderInfo;
import com.xh.product.service.ReserveService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Title: 消费者
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
@Component
public class ReceiveListener {

    @Resource
    private ReserveService reserveService;

    @JmsListener(destination = "active.order.topic.msg", containerFactory = Cons.TOPIC_LISTENER)
    public void topicOrder(String message) {
        System.out.println("message = "+message);
        OrderInfo order = JSON.parseObject(message, OrderInfo.class);
        Integer count = 0;
        if (order != null) {
            count = reserveService.update(order.getBuyCount(), order.getProductId());
            System.out.println("Receive:队列：queueOrder1 商品名字：" + order.getProductName() + ",商品购买数量：" + order.getBuyCount());
            System.out.println("count = " + count);
        }
    }

}
