package day14_string;
/*
    .equals(String)
    .equalIgnoreCase(String)
    .length()
    .toUpperCase()
    .toLowerCase()
    .startsWith(String)
    .endsWith(String)
 */
public class Contains {
    public static void main(String[] args) {
        String day = "Today it was a Java class";

        System.out.println(day.contains("it was"));
        System.out.println(day.contains(" Java class"));

        String str = "was a SOftSkills";
        System.out.println(day.contains(str));

        System.out.println(day.contains("Today class")); // wrong because it checks same. order not same.
        System.out.println(day.contains("It was a Java class")); // wrong because it checks same. order not same.
        System.out.println(day.contains(" ")); // wrong because it checks same. order not same.
        System.out.println(day.contains("w")); // wrong because it checks same. order not same.
        System.out.println(day.contains("x")); // wrong because it checks same. order not same.

        System.out.println(day + " Or not.");
        System.out.println(day.contains("Or not "));
        System.out.println("---------------");
        System.out.println((day + "Or not. ").contains(" Or not. "));

        if(day.contains("Java")) {
            System.out.println("There is a coding language name in this sentence");
        }
        if (day.contains("java")){
            System.out.println("It does not contain");
        }

        System.out.println(day.contains("t w"));


    }


}
