package com.example.kafkaBasicExample.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = {"kafka-topic"},groupId = "kafka_group")
	public void listenToTopic(String recievedMessage) {
		System.out.println("The message is Recieved "+recievedMessage);
	}

}
