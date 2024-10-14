package com.yaroslav.sakhno.chapter1.formatters;

import com.yaroslav.sakhno.chapter1.Apple;

public class AppleSimpleFormatter implements AppleFormater{
    @Override
    public String accept(Apple apple) {
        return "Вес яблока: " + apple.getWeight();
    }
}
