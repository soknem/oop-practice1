package com.setec.java.oop;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {

  public static double input(String string) {
    // TODO Auto-generated method stub
    Scanner cin = new Scanner(System.in);
        double value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.print(string);
            try {
                value = cin.nextDouble();

                if (value < 0) {
                    System.out.println("Invalid number! Enter a positive value.");
                } else {
                    valid = true; // input is valid
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid number! Enter numeric value.");
                cin.nextLine(); // clear the invalid input
            }
        }

        return value;
  }
  
  public static double getDiscount(double total) {
    double dis;
        if (total <= 0)
            dis = 0;
        else if (total <= 50)
            dis = 5;
        else if (total <= 150)
            dis = 10;
        else
            dis = 15;
        return dis;
  }
  
  public static double disPrice(double total, double dis) {
        return total * dis / 100;
    }


  public static void displayReport(double total, double dis, double disPrice, double payment) {
    // TODO Auto-generated method stub
    DecimalFormat df = new DecimalFormat("$#,##0.00");
        System.out.println("---------------------------------------------");
        System.out.println("Total     = " + df.format(total));
        System.out.println("Discount  = " + dis + "%");
        System.out.println("DisPrice  = " + df.format(disPrice));
        System.out.println("Payment   = " + df.format(payment));
  }

  
}
