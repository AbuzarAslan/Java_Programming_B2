package day11_if_statements;

public class TernaryExample {
    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd = "";

        if(a %2 == 0) {
            evenOrOdd = "Even";
        } else {

        } evenOrOdd = "Odd";

        // In Java, there is shorter SYNTAX version of If Else.
        /*
        (a % 2 ==0) -----> continue
        ?           -----> if TRUE OR FALSE
        "EVEN"      -----> first value is always for TRUE
        :           -----> else
        "Odd"       -----> second value is always for FALSE

              firstValue and secondValue hase yo be same DATA Type.

         */
        int num = 4;
        String result = (num > 10)? "BiggerThanTen" : "NotBiggerThanTen";


        int number = -4;
        String sign = (num >0)? "positive" : (num < 0)? "negative" : "Zero";







    }
}
