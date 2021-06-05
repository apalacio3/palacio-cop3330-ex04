/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class MadLib
{
    public static void main( String[] args )
    {
        System.out.print("Enter a noun: ");

        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        String output = "\"Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!\"";

        System.out.println(output);
    }
}
