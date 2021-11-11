package PartOne;
/*
We can use another relational operator to do this. == will tell us if two variables are equal:

double paycheckAmount = 620;
double calculatedPaycheck = 15.50 * 40;
 
System.out.print(paycheckAmount == calculatedPaycheck);
// This will print true, since paycheckAmount equals calculatedPaycheck

To check if two variables are not equal, we can use !=:

double balance = 20000.0;
double amountToDeposit = 620;
double updatedBalance = balance + amountToDeposit;
 
boolean balanceHasChanged = balance != updatedBalance;
// balanceHasChanged holds true, since balance does not equal updatedBalance
*/


public class EqualNotEqual {
    public static void main(String[] args) {
        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        boolean sameNumberOfSongs = songsA == songsB;
        boolean differentLength = albumLengthA != albumLengthB;
    }
}