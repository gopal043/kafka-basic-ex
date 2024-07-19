package com.example.kafkaBasicExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaBasicExample.service.Producer;

@RestController
@RequestMapping("rest/api")
public class RestControllerForLKafkaMsg {

	@Autowired
	Producer producer;
	
	@GetMapping("/produerMsg")
	public void getMessageFromClient(@RequestParam("message") String msg) {
		producer.sendMsgToTopic(msg);
	}
}
