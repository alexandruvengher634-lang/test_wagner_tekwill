package Homework;

import java.util.Scanner;

public class Ex8_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cite puncte ai acumulat?");

        int bal = sc.nextInt();

        if (bal >= 90) {
            System.out.println("Ai nota A");
        }
        else if (bal >= 80 && bal <= 89) {
            System.out.println("Ai nota B");
        }
        else if (bal >= 70 && bal <= 79) {
            System.out.println("Ai nota C");
        }
        else if (bal >= 60 && bal <= 69) {
            System.out.println("Ai nota D");
        }
        else if (bal<60) {
            System.out.println("Ai nota F");
        }
    }
}
