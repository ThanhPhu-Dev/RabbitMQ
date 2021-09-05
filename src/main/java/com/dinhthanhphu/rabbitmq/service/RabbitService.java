package com.dinhthanhphu.rabbitmq.service;

import com.dinhthanhphu.rabbitmq.config.RabbitMQConfig;
import com.dinhthanhphu.rabbitmq.dto.MessageDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(MessageDTO messageDTO) {
        System.out.println("Message recieved from queue : " + messageDTO.getMessage());
    }
}
