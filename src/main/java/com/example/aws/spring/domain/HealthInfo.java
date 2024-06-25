package com.example.aws.spring.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class HealthInfo {

    private Integer status;
    private Date date;
}
