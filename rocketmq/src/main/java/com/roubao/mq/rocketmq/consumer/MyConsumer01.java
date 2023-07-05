package com.roubao.mq.rocketmq.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author SongYanBin
 * @copyright ©2023-2099 SongYanBin. All rights reserved.
 * @since 2023/7/5
 **/    
@Component
@RocketMQMessageListener(topic = "my-topic-01", consumerGroup = "my-producer-group-01")
public class MyConsumer01 implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("消费者成功接收到消息：" + s);
    }
}
