package com.xh.product.test;

import com.xh.product.entity.Reserve;
import com.xh.product.service.impl.ReserveServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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
public class ReserveServiceTest {

    @Resource
    private ReserveServiceImpl reserveService;

    @Test
    public void findByProductId() {
        long productId = 1;
        Reserve reserve = reserveService.findByProductId(productId);
        System.out.println(reserve.toString());
    }

    @Test
    public void update() {
        long productId = 1;
        int currentCount = reserveService.update(3, productId);
        System.out.println("currentCount = " + currentCount);
    }


}
