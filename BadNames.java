/*
In Java, variable names are case-sensitive. myHeight is a different variable from myheight. The length of a variable name is unlimited, but we should keep it concise while keeping the meaning clear.

A variable starts with a valid letter, or a $, or a _. No other symbols or numbers can begin a variable name. 1stPlace and *Gazer are not valid variable names.

Variable names of only one word are spelled in all lowercase letters. Variable names of more than one word have the first letter lowercase while the beginning letter of each subsequent word is capitalized. This style of capitalization is called camelCase.


public class BadNames {
    public static void main(String[] args) {   
		String 1stName = "Samira";
    String blah = "Smith";
    String .com = "samira@google.com";
    int salaryexpectation = 100000;
    int year_of_birth = 1955;
    
    System.out.println("The program runs!");
	}
}

*/

public class BadNames {
    public static void main(String[] args) {
        String firstName = "Samira";
        String blah = "Smith";
        String dotCom = "samira@google.com";
        int salaryexpectation = 100000;
        int year_of_birth = 1955;

        System.out.println("The program runs!");
    }
}