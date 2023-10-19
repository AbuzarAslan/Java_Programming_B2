package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "monday, tuesday, wednesday, thursday, friday";
        String [] days = str.split(",");
        for (String eachElem : days) {
            System.out.println(eachElem);
        }
        System.out.println();

        String [] days2 = str.split("day");
        for ( String each : days2 ){
            System.out.println(each);
        }
        System.out.println("-----------");

        String months = "jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec";
        // can you get each month?
        String [] allMonth = months.split("-");
        for (String eachMonth : allMonth){
            System.out.println(eachMonth);
        }
        System.out.println("-----------");
        String [] arr2 = months.split("y-");
        for ( String eachPart : arr2){
            System.out.println(eachPart);
        }

        System.out.println("==========");
        String [] arr3 = months.split("");

            for ( String eachElem : arr3){
                System.out.println(eachElem);  // burda her elementi char olaraq bir bir print edecek
            }
        System.out.println("--------------");
            String [] arr4 = months.split("java");
            for( String each : arr4){
                System.out.println(each);
            }
        System.out.println(arr4.length);
        System.out.println(Arrays.toString(arr4));
        System.out.println(arr4[0]);







    }
}
