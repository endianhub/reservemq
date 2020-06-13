package com.xh.product.service;

import com.xh.product.entity.Reserve;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
public interface ReserveService {

    /**
     * 获取商品的库存信息
     *
     * @param productId
     * @return
     */
    Reserve findByProductId(Long productId);

    /**
     * 修改库存信息
     *
     * @param count
     * @param productId
     * @return
     */
    Integer update(Integer count, Long productId);


}
