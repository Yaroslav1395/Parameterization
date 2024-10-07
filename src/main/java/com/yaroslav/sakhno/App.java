package com.yaroslav.sakhno;

import com.yaroslav.sakhno.formatters.AppleFancyFormatter;
import com.yaroslav.sakhno.formatters.AppleSimpleFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PrintApple printApple = new PrintApple();
        printApple.prettyPrintApple(printApple.getApples(), new AppleSimpleFormatter());
        printApple.prettyPrintApple(printApple.getApples(), new AppleFancyFormatter());
    }
}
