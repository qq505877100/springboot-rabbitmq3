package com.biz.rabbit;/**
 * Created by dell on 2017/7/10.
 */

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author
 * @description
 * @create 2017-07-10 12:57
 **/
@Component
public class Producer01 {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    //实现群发方法
    public void sendAll(String msg) {
        msg = "producer01 send message is " + msg + " : " + new Date();
        System.out.println(msg);
        rabbitTemplate.convertAndSend("fanoutExchange","YY",msg);

    }

    //实现特定人群发送
    public void sendToOne(String msg,String routingKey) {
        msg = "producer01 send message is " + msg + " : " + new Date();
        System.out.println(msg);
        rabbitTemplate.convertAndSend("topicExchange",routingKey,msg);
    }

}
