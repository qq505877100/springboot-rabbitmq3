package com.biz.config;/**
 * Created by dell on 2017/7/10.
 */

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @description
 * @create 2017-07-10 11:19
 **/
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("helloQueue");
    }

    //设置两个Exchange，一个用来实现群发，另一个实现发给特定的人

    //贤设置三个队列，分别绑定三个消费者
    @Bean
    public Queue AQueue() {
        return new Queue("AQueue");
    }

    @Bean
    public Queue BQueue() {
        return new Queue("BQueue");
    }

    @Bean
    public Queue CQueue() {
        return new Queue("CQueue");
    }

    //创建两个EXchange，一个是TOPIC,一个FANOUT
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    //绑定队列和交换机,6个绑定
    @Bean
    Binding aQueueToFanoutExchange() {
        return BindingBuilder.bind(AQueue()).to(fanoutExchange());
    }

    @Bean
    Binding bQueueToFanoutExchange() {
        return BindingBuilder.bind(BQueue()).to(fanoutExchange());
    }

    @Bean
    Binding cQueueToFanoutExchange() {
        return BindingBuilder.bind(CQueue()).to(fanoutExchange());
    }

    //绑定三个队列到TOPICExchange上
    @Bean
    Binding aQueueToTopicExchange() {
        return BindingBuilder.bind(AQueue()).to(topicExchange()).with("#.A");
    }

    @Bean
    Binding bQueueToTopicExchange() {
        return BindingBuilder.bind(BQueue()).to(topicExchange()).with("#.B");
    }

    @Bean
    Binding cQueueToTopicExchange() {
        return BindingBuilder.bind(CQueue()).to(topicExchange()).with("#.C");
    }






}
