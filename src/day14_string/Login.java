package day14_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = input.next();
        username = username.toLowerCase();

        System.out.print("Enter your password: ");
        String password = input.next();
        String actualPasswordInDB = "loopcamp2023";


        if(password.length() > 8 && password.equals(actualPasswordInDB)) {
            System.out.println("You are logged in. ");

        } else {
            System.out.println("Invalid Password");
        }




    }






}
