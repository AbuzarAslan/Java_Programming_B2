package day05_variables;

public class MyName {

    public static void main(String[] args) {

        char first = 'A';
        char second = 'b';
        char third = 'u';
        char fourth = 'z';
        char fifth = 'a';
        char sixth = 'r';

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);


        System.out.println(first + second +third + fourth + fifth + sixth);

        System.out.println("My name is " + first + second+third + fourth + fifth + sixth);

        String myName = ""+ first + second+third + fourth + fifth + sixth;
        System.out.println("My name is " + myName);

    }
}
