/*
 * package com.example.demo.service;
 * 
 * import java.io.IOException;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.kafka.annotation.KafkaListener; import
 * org.springframework.stereotype.Service;
 * 
 * @Service public class Consumer {
 * 
 * private static final Logger logger = LoggerFactory.getLogger(Producer.class);
 * 
 * @KafkaListener(topics = "users", groupId = "group_id") public void
 * consume(String message) throws IOException {
 * logger.info(String.format("#### -> Consumed message -> %s", message)); } }
 */