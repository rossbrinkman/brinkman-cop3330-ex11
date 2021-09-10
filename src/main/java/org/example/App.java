package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat f = new DecimalFormat("##.00");
        Scanner scanner = new Scanner(System.in);
        int euros;
        float exchangeRate, usDollars;

        System.out.println( "How many euros are you exchanging? " );
        euros = scanner.nextInt();

        System.out.println( "What is the exchange rate? " );
        exchangeRate = scanner.nextFloat();

        usDollars = euros * exchangeRate;

        System.out.println( euros + " euros at an exchange rate of " + exchangeRate + " is "
                + f.format(usDollars) + " U.S. Dollars.");
    }
}
