package com.xh.delievery.service;

import com.xh.delievery.entity.Delievery;

import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
public interface DelieveryService {

    void add(Delievery delievery);

    List<Delievery> findAll();
}
