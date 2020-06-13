package com.xh.product.service.impl;

import com.xh.product.dao.rep.ReserveRepDao;
import com.xh.product.entity.Reserve;
import com.xh.product.service.ReserveService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
@Service
public class ReserveServiceImpl implements ReserveService {

    @Resource
    private ReserveRepDao reserveRepDao;

    @Override
    public Reserve findByProductId(Long productId) {
        return reserveRepDao.getByProductId(productId);
    }

    @Transactional
    @Override
    public Integer update(Integer count, Long productId) {
        reserveRepDao.updateReserve(count, productId);

        Reserve reserve = reserveRepDao.getByProductId(productId);
        return reserve.getCurrentCount();
    }
}
