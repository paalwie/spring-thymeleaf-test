package com.Academy.spring_thymeleaf_test;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person {
    
    private int id;
    private String name;

}
