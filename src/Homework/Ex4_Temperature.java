package Homework;

import java.util.Scanner;

public class Ex4_Temperature {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Ce temperatura este afara?");

         int grade = sc.nextInt();

         if (grade < 10) System.out.println(" Wear a jacket!");
         else if (grade >= 10 && grade <= 25) System.out.println("It's a nice day!");
         else if (grade >= 25) System.out.println("It's very hot, stay hydrated!");




    }

}
