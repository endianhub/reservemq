package com.xh.order.service;

import com.xh.order.entity.OrderInfo;

import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/9
 */
public interface OrderInfoService {

    void add(OrderInfo order);

    List<OrderInfo> findAll();
}
