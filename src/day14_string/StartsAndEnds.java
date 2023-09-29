package day14_string;

public class StartsAndEnds {


    public static void main(String[] args) {
        String str = "Apples";
        System.out.println(str.startsWith("App")); // it returns us boolean, true or false
        System.out.println(str.startsWith("app"));
        System.out.println(str.startsWith("Apple"));

        String str2 = "App";
        System.out.println(str.startsWith(str2));
        System.out.println("---------");


        System.out.println(str.startsWith("   App")); // it is false cuz space is counting

        System.out.println("-------");

        String sentence = "It is a good day";
        System.out.println(sentence.startsWith(" a good day "));
        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("d day"));
        System.out.println(sentence.endsWith("ood day"));
        System.out.println(sentence.endsWith("It is a good day"));



    }
}
