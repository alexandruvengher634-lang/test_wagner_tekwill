package Homework;

import java.util.Scanner;

public class Ex5_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica numele produselor");

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();
        System.out.println("Indica preturile produselor: " + name1 + "; " + name2 + "; " + name3);
        double produs1 = sc.nextDouble();
        double produs2 = sc.nextDouble();
        double produs3 = sc.nextDouble();

        double suma = produs1 + produs2 + produs3;

        if (suma > 100) {
            double suma2 = (suma - (suma * 0.10));
            System.out.print("Aveti reducere 10%, suma totala este " + suma + " iar cu reducere va fi " + suma2);


        } else {
            System.out.print("Nu aveti reducere in numar de 10%");
        }


    }

}

