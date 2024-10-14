package com.yaroslav.sakhno;

import com.yaroslav.sakhno.chapter1.formatters.AppleFancyFormatter;
import com.yaroslav.sakhno.chapter1.formatters.AppleSimpleFormatter;
import com.yaroslav.sakhno.chapter1.PrintApple;
import com.yaroslav.sakhno.chapter2.DataFactory;
import com.yaroslav.sakhno.chapter2.Trader;
import com.yaroslav.sakhno.chapter2.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
        List<Transaction> transactions = DataFactory.getTransactions();

        List<Transaction> transactionByYear = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();

        List<String> uniqueCity = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .toList();

        List<Trader> tradersFromCambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Кембридж"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .toList();

        String names = transactions.stream()
                .map(transaction -> transaction.getTrader().getName() + ", ")
                .distinct()
                .sorted(String::compareTo)
                .reduce("", String::concat);

        boolean isFromMilanExist = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Милан"));

        transactions.stream()
                .filter(transaction -> "Кэмбридж".equals(transaction.getTrader().getCity()))
                .forEach(System.out::println);

        Integer sum = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Кембридж"))
                .map(Transaction::getValue)
                .reduce(0, Integer::sum);

        Optional<Integer> minValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);

        Optional<Transaction> minTransaction = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));

        System.out.println(minTransaction);
    }

    private static void chapterTwo(){
        PrintApple printApple = new PrintApple();
        printApple.prettyPrintApple(printApple.getApples(), new AppleSimpleFormatter());
        printApple.prettyPrintApple(printApple.getApples(), new AppleFancyFormatter());
    }
}
