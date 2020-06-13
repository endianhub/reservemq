package com.xh.delievery.controller;

import com.xh.delievery.entity.Delievery;
import com.xh.delievery.service.DelieveryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
@RequestMapping("/delievery")
public class DelieveryController {

    @Resource
    private DelieveryService delieveryService;

    @ResponseBody
    @RequestMapping(value = "/findAll")
    public List<Delievery> findAll() {
        List<Delievery> list = delieveryService.findAll();
        System.out.println(list.size());
        return list;
    }
}
