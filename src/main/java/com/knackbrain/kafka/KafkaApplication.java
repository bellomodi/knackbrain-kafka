package com.knackbrain.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication(scanBasePackages = "com.knackbrain")
public class KafkaApplication {

    private final Logger logger = LoggerFactory.getLogger(KafkaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }
}
