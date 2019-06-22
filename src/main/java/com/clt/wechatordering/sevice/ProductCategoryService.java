package com.clt.wechatordering.sevice;

import com.clt.wechatordering.pojo.ProductCategory;

import java.util.List;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 14:43 2019/6/13
 */
public interface ProductCategoryService {
    ProductCategory findById(Integer id);

    List<ProductCategory> findAll();
}
