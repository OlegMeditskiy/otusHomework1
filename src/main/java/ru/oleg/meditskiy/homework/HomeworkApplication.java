package ru.oleg.meditskiy.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HomeworkApplication {

    @GetMapping("/health")
    public String health(){
        return "{\"status\": \"OK\"}";
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
    }

}
