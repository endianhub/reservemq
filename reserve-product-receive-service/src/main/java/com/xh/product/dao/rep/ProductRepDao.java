package com.xh.product.dao.rep;

import com.xh.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
public interface ProductRepDao extends JpaRepository<Product, Long> {
}
