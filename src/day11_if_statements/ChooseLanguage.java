package day11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose option below: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - " +
                "Russian\n\t5 - French\n\t6 - Azerbaijani\n\n\tYour choice: ");
        int userOption = input.nextInt();

        String message = "";                //  String message; you cant use like this. have to be after = "";

        if (userOption == 1) {
            message = "Hello, thanks for your call";
        } else if (userOption == 2) {
            message = "Hola, gracias para llamar";
        } else if(userOption == 3) {
            message = "Merhaba, aradiginiz icin tesekkurler";
        }else if (userOption ==4) {
            message = "Privet, sposiba za vash zvonok";
        }else if (userOption == 5) {
            message = "Merci, pour votre appel";
        }else if (userOption == 6) {
            message  = "Salam, zeng etdiyiniz ucun minnetdariq";
        }else {
            message = "No valid option";
        }
        System.out.println(message);


    }

}
