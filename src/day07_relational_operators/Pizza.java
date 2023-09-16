package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza ="Cheese";
        int numOfSlices = 10;
        int numOfPeople = 4;

        int slicesPerPerson = numOfSlices / numOfPeople; // 10/4 ----> 2
        int sliceLeftOver = numOfSlices % numOfPeople; // 10%4 ----> 2
        String report =
                "We ordered " + typeOfPizza + " pizza with the " + numOfSlices  + " slices. " + numOfPeople + " " +
                        "people ate " + slicesPerPerson + " for each. There were " + sliceLeftOver + " slices left";
        System.out.println(report);







    }
}
