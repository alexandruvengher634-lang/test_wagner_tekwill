package Homework;

import java.util.Scanner;

public class Ex7_LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hai sa verificam daca a fost an bisect, anul: ");
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Anul " + year + " a fost an bisect");


        } else
        {
            System.out.println("Anul " + year + " nu a fost bisect");


        }
    }
}