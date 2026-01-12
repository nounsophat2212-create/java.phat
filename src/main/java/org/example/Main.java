package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("Hello work");
      System.out.print("Please input name: ");
      String student = sc.next();

      System.out.print("Please input gender: ");
      String studentGender = sc.next();

      System.out.print("Please input dete of birth: ");
      String dateBirth = sc.next();

      System.out.print("Please input place of birth: ");
      String  place0fbirth= sc.next();

      System.out.print("Please input average: ");
      String average = sc.next();
      int studentId =1;
      String studentName = "org/example/IICondtione";
      String student_gender ="Female";
      String studentBirth ="12/24/1994";
      String studentSR ="Siem Reap";

      System.out.println("student ID =" +studentId);
      System.out.println("student name =" +studentName);
      System.out.println("student  gender="+studentGender);
      System.out.println("student date of birth ="+studentBirth);
      System.out.println("student SR="+studentSR);


    }
}