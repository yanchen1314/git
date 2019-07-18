package com.iweb.o2o.service.impl;

import com.iweb.o2o.entity.Shop;
import com.iweb.o2o.mapper.ShopMapper;
import com.iweb.o2o.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public List<Shop> getAllShops(){
        return shopMapper.getAllShops();
    }
}
