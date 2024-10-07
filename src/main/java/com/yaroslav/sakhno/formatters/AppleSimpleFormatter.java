package com.yaroslav.sakhno.formatters;

import com.yaroslav.sakhno.Apple;

public class AppleSimpleFormatter implements AppleFormater{
    @Override
    public String accept(Apple apple) {
        return "Вес яблока: " + apple.getWeight();
    }
}
