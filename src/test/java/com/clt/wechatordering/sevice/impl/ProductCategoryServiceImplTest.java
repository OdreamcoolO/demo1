package com.clt.wechatordering.sevice.impl;

import com.clt.wechatordering.mapper.ProductCategoryMapper;
import com.clt.wechatordering.pojo.ProductCategory;
import com.clt.wechatordering.sevice.ProductCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryServiceImplTest {

    @Autowired
    ProductCategoryMapper productCategoryMapper;
    @Test
    public void findById() {
        ProductCategory productCategory = productCategoryMapper.finaById(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }


    public static boolean test(int[][] arr, int k){
        int row = arr.length-1;
        int col = arr[0].length-1;
        if (arr[row][0] == k){
            return true;
        }
        for(int i=row,j=0; i>=0&&j<col;){
            if (arr[i][j] == k){
                return true;
            }
            if (arr[i][j] > k){
                i--;
            }
            if (arr[i][j] > k){
                j++;
            }
        }
        return false;
    }

    @Test
    public  void test() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(ProductCategoryServiceImplTest.test(arr,11));
    }

}