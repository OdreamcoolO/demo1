package com.clt.wechatordering.pojo;

import lombok.Data;
import java.util.Date;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 14:24 2019/6/13
 */

@Data
public class SellerInfo {
    private String  id;
    private String username;
    private String password;
    private String openid;
    private Date createTime;
    private Date updateTime;
}
