package Homework;

import java.util.Scanner;

public class Ex3_NumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numarul: ");

        float numar = sc.nextFloat();
        if (numar == 0) {
            System.out.println("zero");
        } else if (numar > 0) {
            System.out.println("pozitiv");
        } else {

                System.out.println("negativ");
            }
        if (numar<1) {
            System.out.println("small");
        }else if (numar>1000000)
                System.out.println("large");

            }


        }






