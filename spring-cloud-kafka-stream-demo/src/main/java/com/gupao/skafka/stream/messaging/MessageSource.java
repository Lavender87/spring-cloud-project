package com.gupao.skafka.stream.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 自定义消息源
 * @since 2017/11/15
 */
public interface MessageSource {

    /**
     * 消息来源的管道名称："gupao"
     */
    String OUTPUT = "gupao";

    @Output(OUTPUT)
    MessageChannel gupao();

}
