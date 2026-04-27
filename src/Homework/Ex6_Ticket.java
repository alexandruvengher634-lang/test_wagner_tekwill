package Homework;

import java.util.Scanner;

public class Ex6_Ticket {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Citi ani ai?");
         int age = sc.nextInt();

         if (age < 12) {
             System.out.println("Biletul va costa 5 lei");}

        else if (age >=12 && age <= 60) {
             System.out.println("Biletul va costa 10lei");

         }
else if (age >60) {
    System.out.println("Biletul va costa 7lei");
         }



    }
}
