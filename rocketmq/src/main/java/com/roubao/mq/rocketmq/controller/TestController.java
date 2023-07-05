package com.roubao.mq.rocketmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roubao.mq.rocketmq.dto.MessageDTO;
import com.roubao.mq.rocketmq.producer.MyProducer01;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author SongYanBin
 * @copyright ©2023-2099 SongYanBin. All rights reserved.
 * @since 2023/7/5
 **/
@Api(tags = "测试MQ消息API")
@RestController
@RequestMapping("/testMQ")
public class TestController {

    @Autowired
    private MyProducer01 myProducer01;

    @ApiOperation("发送消息")
    @PostMapping("/sendMessage")
    public String sendMessage(@RequestBody MessageDTO messageDTO) {
        return myProducer01.sendMessage(messageDTO);
    }
}
