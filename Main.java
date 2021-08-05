
import java.util.Scanner;

    
// DETERMINE A VALID PALINDROME BASED ON THE GIVEN INPUT STRING (CASE
// SENSITIVITY)
/*
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a valid palindrome");
        } else {
            System.out.println(userInput + " isn't a valid palindrome");
        }
    }

    static boolean isPalindrome(String inputString) {
        String[] inputStrArr = inputString.split("");
        int startIndex = 0;
        int endIndex = inputStrArr.length - 1;
        while (startIndex < endIndex) {
            if (!(inputStrArr[startIndex]).equals(inputStrArr[endIndex]))
                return false;
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
*/
// Approach 2: DETERMINE A VALID PALINDROME BASED ON THE GIVEN INTEGER



class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int userInputInteger = sc.nextInt();
    if (isPalindrome(userInputInteger)) {
      System.out.println(userInputInteger + " is a valid palindrome");
    } else {
      System.out.println(userInputInteger + " isn't a valid palindrome");
    }
  }
  static boolean isPalindrome(int inputInteger) {
    String strConversion = String.valueOf(inputInteger);
    String[] inputStrArr = strConversion.split("");
    int startIndex = 0;
    int endIndex = inputStrArr.length - 1;
    while (startIndex < endIndex) {
      if (!(inputStrArr[startIndex]).equals(inputStrArr[endIndex])) return false;
      startIndex++;
      endIndex--;
    }
    return true;
  }
}



*/

// Approach 3: DETERMINE A VALID PALINDROME BASED ON THE STRING GIVEN (MUST
// REMOVE ALL SPECIAL CHARS AND EXCESS SPACES)

/* 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String userInputStr = sc.nextLine();
    if (isPalindrome(userInputStr)) {
      System.out.println(userInputStr + " is a valid palindrome.");
    } else {
      System.out.println(userInputStr + " isn't a valid palindrome");
    }
  }
  static boolean isPalindrome(String inputStr) {
    String regex = "[^a-zA-Z0-9]";
    String removeSpecialCharsAndTrim = inputStr.replaceAll(regex, "").trim();
    String[] inputStrArr = removeSpecialCharsAndTrim.split("");
    int startIndex = 0;
    int endIndex = inputStrArr.length - 1;
    while (startIndex < endIndex) {
      if (!(inputStrArr[startIndex]).equals(inputStrArr[endIndex])) return false;
      startIndex++;
      endIndex--;
    }
    return true;
  }
}
*/


/* 
Removing Duplicates in case we can't use Set():

import java.util.Arrays;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 0, 0, 3, 4, 5, 5, 2, 4));
    removeDuplicates(arrayList);
    System.out.println("ArrayList after removing duplicates: " + arrayList);
  }

  static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrList) {
    for (int i = 0; i < arrList.size(); i++) {
      for (int j = i + 1; j < arrList.size(); j++) {
        if ((arrList.get(i)).equals(arrList.get(j))) {
          arrList.remove(j);
          j--;
        }
      }
    }
    return arrList;
  }
}
*/
