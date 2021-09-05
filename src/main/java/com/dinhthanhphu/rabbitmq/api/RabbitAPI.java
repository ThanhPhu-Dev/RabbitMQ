package com.dinhthanhphu.rabbitmq.api;

import com.dinhthanhphu.rabbitmq.config.RabbitMQConfig;
import com.dinhthanhphu.rabbitmq.dto.MessageDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitAPI {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/messages/send")
    public String bookOrder(@RequestBody MessageDTO messageDTO) {
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, messageDTO);
        return "Success !!";
    }
}
