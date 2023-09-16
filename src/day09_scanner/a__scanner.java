package day09_scanner;

import java.util.Scanner;

public class a__scanner {
    public static void main(String[] args) {

/*
     Write a program that asks the user to enter a price and quantity and then calculate the revenue.

     Calculation: revenue = price × quantity.

*/
         // 1) First I need to import the package that has the Scanner class in it
            // 2) Then I need to create an OBJECT of the Scanner class

            // *) If I want to use a class from a different package, I need to import it
            // *) If I want to user anything from that class, I need to create the object of it.

            Scanner input = new Scanner(System.in); // input --- >  is a reference to the object
            System.out.print("Enter the price: $");
            double price = input.nextDouble();
            System.out.print("Enter the quantity: ");
            int quantity = input.nextInt();

            double revenue = price * quantity;

            System.out.println("Revenue: $" + revenue);





        }
}
