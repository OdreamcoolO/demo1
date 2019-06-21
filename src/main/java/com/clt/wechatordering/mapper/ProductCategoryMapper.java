package com.clt.wechatordering.mapper;

import com.clt.wechatordering.pojo.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductCategoryMapper {

    ProductCategory finaById(Integer id);

}
