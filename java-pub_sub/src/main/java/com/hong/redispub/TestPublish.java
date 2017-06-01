package com.hong.redispub;

import redis.clients.jedis.Jedis;

public class TestPublish {
	 public static  void  main(String[] args) throws Exception{  
	        Jedis jedis = new Jedis("localhost");  
	        jedis.publish("redisChat", "Redis is a great caching technique");  
	        Thread.sleep(5000);  
	        jedis.publish("redisChat", "build your dream");  
	        Thread.sleep(5000);  
	        jedis.publish("redisChat", "over");  
	    }  

}
