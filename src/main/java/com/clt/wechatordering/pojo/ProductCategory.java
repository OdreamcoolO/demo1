package com.clt.wechatordering.pojo;

import lombok.Data;


import java.util.Date;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 14:19 2019/6/13
 */
@Data
public class ProductCategory {
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;

}
