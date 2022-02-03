package Part_One_Fundamentals;
public class Magic {
    public static void main(String[] args) {
        int myNumber = 5;
        // original number was 7
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);

    }
}