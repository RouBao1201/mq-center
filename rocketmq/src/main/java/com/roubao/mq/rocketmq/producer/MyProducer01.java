package com.roubao.mq.rocketmq.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roubao.mq.rocketmq.dto.MessageDTO;

/**
 * @author SongYanBin
 * @copyright ©2023-2099 SongYanBin. All rights reserved.
 * @since 2023/7/5
 **/
@Component
public class MyProducer01 {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public String sendMessage(MessageDTO messageDTO) {
        rocketMQTemplate.convertAndSend(messageDTO.getTopic(), messageDTO.getMessage());
        return "消息发送成功";
    }
}
