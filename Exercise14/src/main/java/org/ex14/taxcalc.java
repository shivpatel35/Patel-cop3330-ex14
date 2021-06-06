package org.ex14;

import java.util.Scanner;

public class taxcalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double rate;

        System.out.print("What is the order amount? ");
        double amt = scanner.nextDouble();
        System.out.print("What is the state? ");
        String state = scanner2.nextLine();

       if(state.equals("WI")){
             rate = 0.055;
             double tax = rate * amt;
             System.out.print("The subtotal is $" + amt + "\nThe tax is $" + tax + "\nThe total is $" + (tax + amt));
        }
       System.out.print("The total is $" + amt);


    }
}
