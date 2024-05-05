package com.rabbitmq.javaguides.youtube.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Value("${rabbitmq.queue.name}")
    private String queue;

    @Value("${rabbitmq.queue.jsonname}")
    private String jsonqueue;

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;


    @Value("${rabbitmq.routing.json.key}")
    private String jsonRoutingKey;

    //spring bean for rabbitmq queue 1
    @Bean
    public Queue queue(){
        return new Queue(queue);
    }

    @Bean
    public Queue jsonqueue(){
        return new Queue(jsonqueue);
    }

    //spring bean for rabbitmq exchange
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(exchange);
    }

    //spring bean for binding exchange and queue using routing key for Queue1
    @Bean
    public Binding binding(){
        return BindingBuilder
                .bind(queue())
                .to(exchange())
                .with(routingKey);
    }

    @Bean
    public Binding bindingJson(){
        return BindingBuilder
                .bind(jsonqueue())
                .to(exchange())
                .with(jsonRoutingKey);
    }


}
