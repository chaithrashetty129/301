package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping(value = "/kafka")
public class UserController {
	
	
	@Autowired
	//private KafkaTemplate<String, String> kafkaTemplate;  -->1
	
	private KafkaTemplate<String,User> kafkaTemplate;
	
	//private static final String TOPIC = "Kafka_Example";  -->1
	private static final String TOPIC = "Kafka_Example";
	
	/*1
	@GetMapping("/publish/{message}")
	public String post(@PathVariable("message") final String message) {
		kafkaTemplate.send(TOPIC,message );
		return "Publishes Successfully";
	}
	
	*/
	
	//if we wish we can use post mapping as well
	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {
		kafkaTemplate.send(TOPIC,new User(name, 23) );
		return "Publishes Successfully";
	}

}
