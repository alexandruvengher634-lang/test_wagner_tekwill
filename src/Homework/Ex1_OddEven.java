package Homework;

import java.util.Scanner;

public class Ex1_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdu numarul pentru a verifica daca este par sau impar");

        int num = sc.nextInt();


        if (num % 2 == 0){
            System.out.println("Numarul: " + num + " este par");

        }else {
            System.out.println("Numarul: " + num + " este impar");

        }
    }
}
