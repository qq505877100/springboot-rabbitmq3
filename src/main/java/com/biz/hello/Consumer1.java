package com.biz.hello;/**
 * Created by dell on 2017/7/10.
 */

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author
 * @description
 * @create 2017-07-10 11:25
 **/
@Component
@RabbitListener(queues = "helloQueue")
public class Consumer1 {

    @RabbitHandler
    public void onMessage(String msg) {
        System.out.println("reciver: " + msg);
    }
}
