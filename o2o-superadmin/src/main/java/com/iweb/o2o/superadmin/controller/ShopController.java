package com.iweb.o2o.superadmin.controller;

import com.iweb.o2o.entity.Shop;
import com.iweb.o2o.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/admin")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/shop")
    public ModelAndView testshop() {
        ModelAndView mv = new ModelAndView();

        //模型数据
        List<Shop> allShops = shopService.getAllShops();
        mv.addObject("shops",allShops);
        //视图
        mv.setViewName("shop.html");
        return mv;
    }
}
