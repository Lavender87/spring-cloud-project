package com.gupao.skafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Kafka 消费者监听器
 *
 * @since 2017/11/12
 */
@Component
public class KafkaConsumerListener {

    @KafkaListener(topics ="${kafka.topic}")
    public void onMessage(String message) {
        System.out.println("Kafka 消费者监听器，接受到消息：" + message);
    }

}
