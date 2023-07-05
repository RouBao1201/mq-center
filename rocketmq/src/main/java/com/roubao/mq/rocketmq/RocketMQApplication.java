package com.roubao.mq.rocketmq;

import com.roubao.web.response.exceptionhandler.EnableCustomGlobalExceptionHandler;
import com.roubao.web.response.unifyresp.EnableCustomUnifiedSuccessResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author SongYanBin
 * @copyright ©2023-2099 SongYanBin. All rights reserved.
 * @since 2023/7/5
 **/
@SpringBootApplication
@EnableCustomGlobalExceptionHandler
@EnableCustomUnifiedSuccessResponse
public class RocketMQApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RocketMQApplication.class);
        app.run(args);
    }
}
