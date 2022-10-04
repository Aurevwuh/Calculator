/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khyle;

import java.util.Scanner;

/**
 *
 * @author Reyes_CPE112
 */
public class Khyle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        double x1;
        double x2;
        String x3;

        System.out.println("Welcome to Khyle's Calculator");
        System.out.println("Please enter 2 numbers");

        while (true) {
            System.out.println("Enter your first number:");
            x1 = input.nextDouble();
            System.out.println("Enter your second number:");
            x2 = input.nextDouble();
            System.out.println("Please enter your desired operation:");
            x3 = input.next();

            if (x3.equals("+")) {
                System.out.println(x1 + x2);
                System.out.println("maayo na");
            } else if (x3.equals("-")) {
                System.out.println(x1 - x2);
                System.out.println("chuyy");
            } else if (x3.equals("*")) {
                System.out.println(x1 * x2);
                System.out.println("paytss");
            } else if (x3.equals("/")) {
                System.out.println(x1 / x2);
                System.out.println("garaa uy");
            }

        }

    }
}

