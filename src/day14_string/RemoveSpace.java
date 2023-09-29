package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "      Thursday     ";
        System.out.println(s);
        System.out.println(s.length());


        System.out.println(s.trim()); // this method will remove the empty spaces from Beginning and End Only.
        System.out.println(s.length()); // here still 19 cuz we didn't reassign

        s = s.trim();    // "     Thursday    " here we reassign s that is  why it is "Thursday" and it is TRUE
        // .otherwise would be FALSE
        System.out.println(s.length());

        System.out.println("----");
        System.out.println(s.startsWith("Thu"));
        System.out.println("-------------");


        String str = "      jave is fun    ";
        str.trim();
        System.out.println(str.endsWith(" fun")); // false because we did trim but did not reassign

        str = str.trim();
        System.out.println(str.endsWith(" fun")); // true cuz we reassigned.









    }






}
