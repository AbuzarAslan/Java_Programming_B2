package day14_string;
/*
    .equals(String) --- > return boolean
    .equalIgnoreCase(String) --- > return boolean
    .length() ----- > Return int
    .toUpperCase()  --- > returns new String all in UPPERCASE
    .toLowerCase()  --- > returns new String all in lowercase
    .startsWith(String) --- > return boolean
    .endsWith(String) --- > return boolean
    .contains(String) --- > return boolean
    .trim() ------- > returns new String removing spaces from BEGINNING and from END ONLY.
    .isEmpty() --- > return boolean if there is NO CHARACTER at all including space -- > "";
    .isBlank() --- > return boolean is there ONLY EMPTY SPACES inside the double quotation
 */
public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";

        System.out.println(str.isEmpty()); // false cuz i have some value

        str = "";

        System.out.println(str.isEmpty()); // ciz we reassigned

        System.out.println("-------------");


        str = " "; // REASSIGNED it to : empty space character
        System.out.println(str.isEmpty()); // is not empty cuz EMPTY SPACE is character


        str = " ";
        System.out.println(str.isBlank()); // BLANK is true cuz it is space but not empty







    }




}
