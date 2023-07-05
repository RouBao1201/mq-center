package com.roubao.mq.rocketmq.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author SongYanBin
 * @copyright ©2023-2099 SongYanBin. All rights reserved.
 * @since 2023/7/5
 **/
@ApiModel("消息DTO")
@Data
@ToString
public class MessageDTO {
    @ApiModelProperty("主题")
    private String topic;

    @ApiModelProperty("消息")
    private String message;
}
