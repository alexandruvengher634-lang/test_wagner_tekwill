package Homework;

import java.util.Scanner;

public class Ex2_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure1 = ("dreptunghiul 1");
        String figure2 = ("dreptunghiul 2");

        System.out.println("Introdu valorile pentru a calcula aria la " + figure1);

        int latime1 = sc.nextInt();
        int lungime1 = sc.nextInt();

        System.out.println("Introdu valorile pentru a calcula aria la " + figure2);
        int latime2 = sc.nextInt();
        int lungime2 = sc.nextInt();


        int aria1 = latime1 * lungime1;
        int aria2 = latime2 * lungime2;

        if (aria1 < aria2) {
            System.out.print("Aria " + figure1 + " este mai mica ca aria " + figure2);
        } else if (aria1 > aria2) {
            System.out.print("Aria " + figure1 + " este mai mare ca aria " + figure2);
        } else if (aria1 == aria2) {
            System.out.print("Aria " + figure1 + " este egala cu " + figure2);
        }


    }
}

