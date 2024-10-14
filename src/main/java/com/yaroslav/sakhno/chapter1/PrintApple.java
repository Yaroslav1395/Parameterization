package com.yaroslav.sakhno.chapter1;

import com.yaroslav.sakhno.chapter1.formatters.AppleFormater;

import java.util.ArrayList;
import java.util.List;

public class PrintApple {
    private List<Apple> apples;

    public PrintApple() {
        this.apples = new ArrayList<>();
        apples.add(new Apple("Красное", 100));
        apples.add(new Apple("Зеленое", 160));
    }

    public List<Apple> getApples() {
        return apples;
    }

    public void prettyPrintApple(List<Apple> appals, AppleFormater appleFormater){
        for(Apple apple : appals){
            String message = appleFormater.accept(apple);
            System.out.println(message);
        }
    }
}
