package com.yaroslav.sakhno.chapter2;

import java.util.Arrays;
import java.util.List;

public class DataFactory {

    public static List<Transaction> getTransactions() {
        Trader raoul = new Trader("Рауль", "Кембридж");
        Trader mario = new Trader("Марио", "Милан");
        Trader alan = new Trader("Алан", "Кембридж");
        Trader brian = new Trader("Брайн", "Кембридж");
        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }
}
