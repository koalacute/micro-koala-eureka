package com.koalacute.micro.koala.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

@EnableEurekaServer
@SpringBootApplication
@PropertySource(value = "classpath:/config/*.yml", ignoreResourceNotFound = true)
public class MicroKoalaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroKoalaEurekaApplication.class, args);
    }

}
