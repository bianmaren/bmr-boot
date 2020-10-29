package com.bianmaren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class BmrBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmrBootAdminApplication.class, args);
    }

}
