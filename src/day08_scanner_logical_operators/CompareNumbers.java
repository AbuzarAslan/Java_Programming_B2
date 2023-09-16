package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();    // we are getting some (data, info,) from user and storing it into
        // container/variable
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();


        System.out.println("Numbers are equal? " + (num1 == num2));
    }



}
