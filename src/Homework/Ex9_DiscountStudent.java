package Homework;

import java.util.Scanner;

public class Ex9_DiscountStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Citi ani ai?");
        int age = sc.nextInt();

        System.out.print("Sunteti student?");
        boolean student = sc.nextBoolean();

        if (student || age<18){
            System.out.println("Ai reducere 20%");
        }
        else{
            System.out.println("Nu primesti reducere");
        }

    }
}
