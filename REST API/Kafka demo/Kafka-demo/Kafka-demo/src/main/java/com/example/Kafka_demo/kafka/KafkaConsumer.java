package com.example.Kafka_demo.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//@Service
@Component
public class KafkaConsumer {

    @Autowired
    private KafkaConsumerConfig kafkaConsumerConfig;


//    @KafkaListener(topics = "kafka_test",groupId = "my_consumer",properties = {"bootstrap.server=localhost:9092"})
@KafkaListener(id = "myListener",topics = "kafka_test",groupId = "my_consumer",  autoStartup = "${listen.auto.start:true}", concurrency = "${listen.concurrency:3}")
    public void listen( String message){

    System.out.println("Received message = "+ message );
    }



}
