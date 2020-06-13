package com.xh.order.test;

import com.xh.order.SpringBootOrderInfoApplication;
import com.xh.order.entity.OrderInfo;
import com.xh.order.service.OrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootOrderInfoApplication.class) // 指定spring-boot的启动类
public class OrderServiceTest {

    @Resource
    private OrderInfoService orderService;

    /**
     * 开始下单
     */
    @Test
    public void placeAnOrder() {
        OrderInfo order = new OrderInfo();
        order.setProductId(1);
        order.setUserId(1);
        order.setBuyCount(5);
        order.setMonetary(30.4);
        order.setCreateTime(new Date());

        orderService.add(order);
    }

    @Test
    public void findAll() {
        List<OrderInfo> list = orderService.findAll();
        System.out.println(list.size());
    }
}
