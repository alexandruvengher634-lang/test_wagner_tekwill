package Homework;

import java.util.Scanner;

public class Ex10_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int lungime = password.length();

        if(lungime<=6){
            System.out.println("Weak password");
        }else if(lungime>6 && lungime<12){
            System.out.println("Moderate password");
        }else if(lungime>12){
            System.out.println("Strong password");
        }




    }

}
