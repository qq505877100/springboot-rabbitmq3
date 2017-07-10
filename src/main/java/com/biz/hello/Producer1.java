package com.biz.hello;/**
 * Created by dell on 2017/7/10.
 */

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author
 * @description
 * @create 2017-07-10 11:23
 **/
@Component
public class Producer1 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send1() {
        String msg = "hello world";
        System.out.println("send1: " + msg);
        rabbitTemplate.convertAndSend("helloQueue",msg);
    }
}
