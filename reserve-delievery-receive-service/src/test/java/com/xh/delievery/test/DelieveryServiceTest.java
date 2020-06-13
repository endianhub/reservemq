package com.xh.delievery.test;

import com.xh.delievery.entity.Delievery;
import com.xh.delievery.service.DelieveryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

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
public class DelieveryServiceTest {

    @Resource
    private DelieveryService delieveryService;

    @Test
    public void add() {
        Delievery delievery = new Delievery();
        delievery.setOrderId((long) 1);
        delievery.setCreateTime(new Date());
        delieveryService.add(delievery);
    }
}
