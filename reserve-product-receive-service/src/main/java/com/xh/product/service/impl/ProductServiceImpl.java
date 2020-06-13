package com.xh.product.service.impl;

import com.xh.product.dao.rep.ProductRepDao;
import com.xh.product.entity.Product;
import com.xh.product.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductRepDao productRepDao;

    @Override
    public List<Product> findAll() {
        return productRepDao.findAll();
    }

    @Override
    public Product findById(Long pId) {
        return productRepDao.findById(pId).orElse(null);
    }
}
