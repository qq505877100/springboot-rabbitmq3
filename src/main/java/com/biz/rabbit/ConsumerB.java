package com.biz.rabbit;/**
 * Created by dell on 2017/7/10.
 */

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author
 * @description
 * @create 2017-07-10 12:56
 **/
@Component
@RabbitListener(queues = "BQueue")
public class ConsumerB {

    @RabbitHandler
    public void onMessage(String msg) {
        System.out.println("ConsumerB收到消息为： " + msg);
    }
}
