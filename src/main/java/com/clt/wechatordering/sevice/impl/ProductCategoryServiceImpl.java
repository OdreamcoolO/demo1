package com.clt.wechatordering.sevice.impl;

import com.clt.wechatordering.mapper.ProductCategoryMapper;
import com.clt.wechatordering.pojo.ProductCategory;
import com.clt.wechatordering.sevice.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 14:43 2019/6/13
 */
@Service("ProductCategoryService")
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public ProductCategory findById(Integer id) {
        return productCategoryMapper.findById(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryMapper.findAll();
    }
}
