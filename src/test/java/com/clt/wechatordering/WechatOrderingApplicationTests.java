package com.clt.wechatordering;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WechatOrderingApplicationTests {

    @Test
    public void contextLoads() {
    }



    @Test
    public void logtest(){
        log.debug("debug.......");
        log.info("info.......");
        log.error("error.......");
//        Assert.assertEquals();
//        Assert.assertNotEquals();

    }
}
