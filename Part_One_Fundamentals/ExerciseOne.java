package Part_One_Fundamentals;
public class ExerciseOne {
    public static void main(String[] args) {

        int randomNum = (int) (Math.random() * 10) + 1;
        System.out.println("Your random number between one and ten is " + randomNum);

        int negativeNum = -2;
        int absNum = Math.abs(negativeNum);
        System.out.println("The absolute value of " + negativeNum + " is " + absNum);

        String myNewString = Integer.toString(1);
        System.out.println(myNewString);

    }
}