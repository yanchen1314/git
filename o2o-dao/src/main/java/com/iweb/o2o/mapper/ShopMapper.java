package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShopMapper {
    List<Shop> getAllShops();
}
