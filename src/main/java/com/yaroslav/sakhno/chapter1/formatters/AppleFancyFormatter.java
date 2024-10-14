package com.yaroslav.sakhno.chapter1.formatters;

import com.yaroslav.sakhno.chapter1.Apple;

public class AppleFancyFormatter implements AppleFormater {
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "тяжелое" : "легкое";
        return "Это " + characteristic + " " + apple.getColor() + " яблоко";
    }
}
