package PartOne;
/*
To declare a variable with a value that cannot be manipulated, we need to use the final keyword. To use the final keyword, prepend final to a variable declaration like so:

final int yearBorn = 1968;
When we declare a variable using final, the value cannot be changed; any attempts at doing so will cause an error to occur:

error: cannot assign a value to final variable yearBorn
*/


public class Final {
    public static void main(String[] args) {
        final double pi = 3.14;
        System.out.println(pi);
    }
}