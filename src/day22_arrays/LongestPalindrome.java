package day22_arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";
        // Then reverse
        // then compare if they match
        // then compare which one is longest


        for (int i = 0; i < arr.length; i++) { // with this outer loop i am getting each element of the arrays

            String eachWord = arr[i]; // here on each cycle assigning the values of the specific index of array to String each word
            String reversed = ""; //avaj // on each cycle I am declaring a new String reversed with and "" empty value

            for (int j = eachWord.length() - 1; j >= 0; j--) {  //burda tersine olur cunki Palindrom du
                // on each OUT loop cycle, and also creating a new loop. // with INNER Loop i am getting each
                // character of eachWord starting from end


                reversed = "" + reversed + eachWord.charAt(j); // i am adding each character into this String reversed

            }
            if (eachWord.equals(reversed)) { //java <-> avaj
                if (eachWord.length() > longestPalindrome.length()) {

                    longestPalindrome = eachWord;
                }
            }
        }
        System.out.println(longestPalindrome);
    }
}




