package com.clt.wechatordering;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.PriorityQueue;
import java.util.Queue;

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

    @Test
    public void test(){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
