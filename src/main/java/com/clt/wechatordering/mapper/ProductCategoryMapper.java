package com.clt.wechatordering.mapper;

import com.clt.wechatordering.pojo.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {

    ProductCategory findById(Integer id);

    List<ProductCategory> findAll();
}
