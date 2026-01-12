package org.example;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        double average = 32.50;

        double Average = 0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an average: ");
        average = input.nextDouble();


        // IF Statement
        if(average < 30) {
            System.out.println("average is lass thm 30");
            System.out.println("you are failed");
            System.out.println("PLease try ahin next month");
        }
        if (average >= 30);{
            System.out.println("average is lass thm 30");
            System.out.println("you are failed");
            System.out.println("PLease try ahin next month");
        }
    }
}
