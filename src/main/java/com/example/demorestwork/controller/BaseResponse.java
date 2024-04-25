package com.example.demorestwork.controller;

public class BaseResponse {
    private final String maxSalary;
    private final String minSalary;
    private final String avgSalary;

    public BaseResponse(String maxSalary, String minSalary, String avgSalary) {
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.avgSalary = avgSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public String getAvgSalary() {
        return avgSalary;
    }
}
