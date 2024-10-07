package com.yaroslav.sakhno.formatters;

import com.yaroslav.sakhno.Apple;
import com.yaroslav.sakhno.formatters.AppleFormater;

public class AppleFancyFormatter implements AppleFormater {
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "тяжелое" : "легкое";
        return "Это " + characteristic + " " + apple.getColor() + " яблоко";
    }
}
