package com.xh.product.controller;

import com.xh.product.entity.Product;
import com.xh.product.service.ProductService;
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
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "/findAll")
    public List<Product> findAll() {
        List<Product> list = productService.findAll();
        System.out.println(list.size());
        return list;
    }
}
