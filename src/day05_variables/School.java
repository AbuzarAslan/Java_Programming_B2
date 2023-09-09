package day05_variables;

public class School {
    public static void main(String [] args) {

        int numberOfStudentsInGrade1 = 30;
        int numberOfStudentsInGrade2 = 40;
        int numberOfStudentsInGrade3 = 25;
        int numberOfStudentsInGrade4 = 10;
        int numberOfStudentsInGrade5 = 38;

        // How can I calculate the total number of students
        int totalNumberOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5 ;

        System.out.println("Number of students in Grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of students in Grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of students in Grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of students in Grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of students in Grade 5: " + numberOfStudentsInGrade5);

        System.out.println("Total number of students = "  + totalNumberOfStudents);



    }
}
