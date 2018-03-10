package com.iotek.controller;

import com.iotek.po.Product;
import com.iotek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by xiaohuang on 2018/3/8.
 * ----------------The heart withered--------
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;




    @RequestMapping(value = "/allproduct")
    public @ResponseBody List<Product>   getProducts(){
     return    productService.queryAllProduct();


    }

}
