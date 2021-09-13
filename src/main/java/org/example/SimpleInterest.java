package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class SimpleInterest
{
    public static void main( String[] args )
    {
        //Define variables
        Scanner input = new Scanner(System.in);

        int years, end;
        double principle, rate;

        //Gets input for Principle, interest, and years
        System.out.print("Enter the principle: ");
        principle = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        rate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        //Calculate end total
        end = (int)Math.round(principle * (1 + (rate / 100 *years)));

        //Display result
        System.out.println("After " +years+ " years at " +rate+ "%, the investment will be worth $" +end+".");
    }
}
