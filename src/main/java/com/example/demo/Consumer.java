package com.example.demo;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "mtopic",groupId = "group_id",containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consumer(User user){
        System.out.println(user.getName());
    }
}
