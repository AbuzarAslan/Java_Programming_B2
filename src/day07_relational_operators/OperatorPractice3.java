package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {

        int h = 5; // we declared an int variable called h and assign a value 5 to it.
        int p = h; // I declared an int variable called p and assigned a value from h

        h++; // post-increment - no other code | just increase by 1
        System.out.println("h: " + h);
        System.out.println("p: " + p);

        int k =h++;
        System.out.println("h: " + h);
        System.out.println("k: " + k);

        int g = ++h;
        System.out.println("h: " + h);
        System.out.println("g: " + g);








    }
}
