package com.example.kafkaBasicExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaBasicExampleApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(KafkaBasicExampleApplication.class, args);
	}
	

}
/*
 * 1) Start Zookeeper
 * 
 * cmd>cd C:\kafka_2.12-2.6.0 cmd> .\bin\windows\zookeeper-server-start.bat
 * .\config\zookeeper.properties
 * 
 * 2)Start Kafka setup
 * 
 * cmd> cd C:\kafka_2.12-2.6.0 cmd> .\bin\windows\kafka-server-start.bat
 * .\config\server.properties 
 * 
 * 3) Create a Topic
 * 
 * cmd>.\bin\windows\kafka-topics.bat --create --topic kafka-topic
 * --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3
 * 
 * 4)List Topics
 * 
 * cmd>.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
 */