package com.xh.delievery.service.impl;

import com.xh.delievery.dao.rep.DelieveryRepDao;
import com.xh.delievery.entity.Delievery;
import com.xh.delievery.service.DelieveryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
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
public class DelieveryServiceImpl implements DelieveryService {

    @Resource
    private DelieveryRepDao delieveryRepDao;

    @Transactional
    @Override
    public void add(Delievery delievery) {
        delieveryRepDao.save(delievery);
    }

    @Override
    public List<Delievery> findAll() {
        return delieveryRepDao.findAll();
    }
}
