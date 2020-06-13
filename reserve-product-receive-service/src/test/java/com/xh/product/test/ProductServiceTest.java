package com.xh.product.test;

import com.xh.product.entity.Product;
import com.xh.product.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Resource
    private ProductService productService;

    @Test
    public void findAll() {
        List<Product> list = productService.findAll();
        System.out.println(list.size());
    }

    @Test
    public void findById() {
        long pid = 1;
        Product product = productService.findById(pid);
        System.out.println(product.toString());
    }


}
