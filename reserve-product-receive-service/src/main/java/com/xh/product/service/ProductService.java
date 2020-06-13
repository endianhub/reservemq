package com.xh.product.service;

import com.xh.product.entity.Product;

import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
public interface ProductService {

    /**
     * 获取商品列表
     *
     * @return
     */
    List<Product> findAll();

    /**
     * 获取商品信息
     *
     * @param pId
     * @return
     */
    Product findById(Long pId);
}
