import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

/*
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
 */



public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ans = "";
        sc.close();
        if (n % 2 != 0) {
            ans = "Weird";
        } else {
            if (n >= 2 && n <= 5) {
                ans = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }

        }
        System.out.println(ans);

        /*
         * Note: If you use the nextLine() method immediately following the nextInt()
         * method, recall that nextInt() reads integer tokens; because of this, the last
         * newline character for that line of integer input is still queued in the input
         * buffer and the next nextLine() will be reading the remainder of the integer
         * line (which is empty).
         */


        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);




        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

        /*
         * In each line of output there should be two columns: The first column contains
         * the String and is left justified using exactly characters. The second column
         * contains the integer, expressed in exactly digits; if the original input has
         * less than three digits, you must pad your output's leading digits with
         * zeroes.
         * 
         * Sample Input
         * 
         * java 100 
         * cpp 65 
         * python 50
         * 
         * First s1 which is formatted using %-15s. The % means that what follows is an
         * argument that will be formatted. Then follows a - resulting in left
         * alignment. 15 fills the string up to a length of 15 characters (adding spaces
         * at the end). Finally the s means, that you are formatting a string.
         * 
         * Second x which is formatted using %03d. Here the 0 is the fill character,
         * meaning that, if necessary, zeros are added. The 3 is again the width,
         * meaning the fill character 0 is added as many times as necessary to make it 3
         * digits long (this time at the beginning). Finally d means, that a integer is
         * formatted.
         */

    }
}