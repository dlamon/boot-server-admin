package com.example.bootserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class BootServerAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootServerAdminApplication.class, args);
    }

}

