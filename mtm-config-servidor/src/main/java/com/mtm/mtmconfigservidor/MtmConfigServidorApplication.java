package com.mtm.mtmconfigservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MtmConfigServidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MtmConfigServidorApplication.class, args);
    }

}
