package day15_string;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();



        // get the first character
        System.out.println("First character: " + sentence.charAt(0));

        // get last character
        System.out.println("Last character: " + sentence.charAt(sentence.length() - 1));

        //if you do just enter or like "" it means nothing inside and will give error. means there is no character
        // there is no character + there is no index






    }

}
