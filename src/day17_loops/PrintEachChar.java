package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "loop";
        //            0123
        System.out.println(str.charAt(0)); //l
        System.out.println(str.charAt(1)); //o
        System.out.println(str.charAt(2)); //o
        System.out.println(str.charAt(3)); //p

        System.out.println("\nLet's do it with the loop");
        str = "loop";  // you can change word size
        //     0123

        for (int i = 0; i <= 3; i++) {     // or less than str.length() - 1. (int i = 0; i <= str.length() - 1; i++)
            System.out.println(str.charAt(i));

        }











    }
}
