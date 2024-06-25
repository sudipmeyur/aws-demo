package com.example.aws.spring.controller;

import com.example.aws.spring.domain.HealthInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @GetMapping(path = "/api/system/health")
    public HealthInfo healthCheck(){
        return HealthInfo.builder().status(HttpStatus.OK.value()).date(new Date()).build();
    }
}
