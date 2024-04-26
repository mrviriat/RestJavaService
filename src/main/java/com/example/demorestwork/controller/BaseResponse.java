package com.example.demorestwork.controller;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class BaseResponse {
    private final Double maxSalary;
    private final Double minSalary;
    private final Double avgSalary;

}
