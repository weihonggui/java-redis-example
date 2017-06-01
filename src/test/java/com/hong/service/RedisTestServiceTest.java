package com.hong.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hong.baseTest.SpringTestCase;
import com.hong.service.RedisTestService;


public class RedisTestServiceTest extends SpringTestCase {
	
	@Autowired  
    private RedisTestService redisTestService;
	
	@Test  
    public void getTimestampTest() throws InterruptedException{  
        System.out.println("��һ�ε��ã�" + redisTestService.getTimestamp("param"));
        Thread.sleep(2000);
        System.out.println("2��֮����ã�" + redisTestService.getTimestamp("param"));
        Thread.sleep(11000);
        System.out.println("�ٹ�11��֮����ã�" + redisTestService.getTimestamp("param"));
    } 
}