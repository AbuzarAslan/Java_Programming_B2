package day15_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words: ");

        String wordOne = input.next();    //java
        String wordTwo = input.next();    // mouse
        String wordThree = input.next();  // computer

        int wordOneLength = wordOne.length();  //4
        int wordTwoLength = wordTwo.length();  //5
        int wordThreeLength = wordThree.length(); //8

        String message = "";




        if ( wordOne.contains("a") && wordOneLength>= wordTwoLength && wordOneLength >= wordThreeLength) {
            message = " Your longest word with 'a' is: " + wordOne;

        }
        else if ( wordTwo.contains("a") && wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength) {
            message = " Your longest word with 'a' is: " + wordTwo;

        }
        else if ( wordThree.contains("a") && wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength){
            message = " Your longest word with 'a' is: " + wordThree;

        } else {
            message = "Our longest word does not have \"a\"";

        }
        System.out.println(message);











    }
}
