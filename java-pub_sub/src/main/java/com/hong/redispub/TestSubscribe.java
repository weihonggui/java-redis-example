package com.hong.redispub;

import redis.clients.jedis.Jedis;

public class TestSubscribe extends Thread{
	  public  static void main(String[] args){  
	        Jedis jedis = new Jedis("localhost");  
	        RedisMsgPubSubListener listener = new RedisMsgPubSubListener();  
	        /** 
	         * 注意：subscribe是一个阻塞的方法，在取消订阅该频道前，会一直阻塞在这，只有当取消了订阅才会执行下面的other code， 
	         * 参考上面代码，我在onMessage里面收到消息后，调用了this.unsubscribe(); 来取消订阅，这样才会执行后面的other code 
	         */  
	        jedis.subscribe(listener, "redisChat");
	        //如果没有取消订阅,方法将一直堵塞在此处不会向下执行  
	          
	        //to do others  
	    }  
	
}
