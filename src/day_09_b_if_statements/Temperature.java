package day_09_b_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the temperature: "); // here we are dynamically getting the value from user each
        // time
        int temp = key.nextInt();
        boolean result = temp >=70;
        // if ( result)

        if ( temp>=70) {
            System.out.println("It is a nice day");
            System.out.println("Go outside, but with your laptop to code Java");}
            else{
                System.out.println("It is too cold");
                System.out.println("Stay home and code more Java");
            }

        }


    }




