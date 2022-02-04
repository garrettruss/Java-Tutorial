package Part_Three_Java_Versions_And_Background.Pre_Java_8.Regex;


/*
 * 1. Regular expressions
 * Regular expressions are the key to powerful, flexible, and efficient text
 * processing. It allow you to describe and parse text. Regular expressions can
 * add, remove, isolate, and generally fold, spindle, and mutilate all kinds of
 * text and data.
 * 
 * 1.1. Metacharacters and literals
 * Full regular expressions are composed of two types of characters.
 * 
 * The special characters (like the * from the filename analogy) are called
 * metacharacters.
 * The rest are called literal, or normal text characters.
 * Regex gain usefulness from advanced expressive powers that their
 * metacharacters provide. We can think of literal text acting as the words and
 * metacharacters as the grammar. The words are combined with grammar according
 * to a set of rules to create an expression that communicates an idea.
 * 
 * 2. Regex Metacharacters
 * Let’s explore the commonly used metacharacters to understand them better.
 * 
 * 2.1. Start and End of the Line
 * The start and end are represented with '^' (caret) and '$' (dollar) signs.
 * The caret and dollar are special in that they match a position in the line
 * rather than any actual text characters themselves.
 * 
 * For example, the regular expression “cat” finds ‘cat’ anywhere in the string,
 * but “^cat” matches only if the ‘cat’ is at the beginning of the line. e.g.
 * words like ‘category’ or ‘catalogue’.
 * 
 * Similarly, “cat$” matches only if the ‘cat’ is at the end of the line. e.g.
 * words like ‘scat’.
 * 
 * 2.2. Character Classes
 * The regular-expression construct "[···]", usually called a character class,
 * lets us list the characters we want to allow at that point in the match.
 * Character classes are useful in creating spell-checkers.
 * 
 * For example, while “e” matches just an e, and “a” matches just an a, the
 * regular expression [ea] matches either. e.g. sep[ea]r[ea]te will match all
 * the words “seperate” “separate” and “separete”.
 * 
 * Another example can be to allow capitalization of a word’s first letter e.g.
 * [Ss]mith will allow the words smith and Smith both.
 * 
 * Similarly, <[hH][123456]> will match all heading tags i.e. H1, H2, H3, H4, H5
 * and H6.
 * 
 * 2.2.1. Range of characters
 * A dash " - " indicates a range of characters. <[hH][1-6]> is similar to
 * <[hH][123456]>. Other useful character ranges are [0-9] and [a-z] which match
 * digits and English lowercase letters.
 * 
 * We can specify multiple ranges in single construct e.g.
 * [0123456789abcdefABCDEF] can be written as [0-9a-fA-F]. Note that order in
 * which ranges are given doesn’t matter.
 * 
 * Note that a dash is a metacharacter only within a character class, otherwise
 * it matches the normal dash character. Also, if it is the first character
 * listed in the range, it can’t possibly indicate a range, so it will not be
 * meta character in this case.
 * 
 * 2.2.2. Negated character classes
 * If we use negation sign ( ^ ) in a character class then the class matches any
 * character that isn’t listed. e.g. [^1-6] matches a character that’s not 1
 * through 6.
 * 
 * 2.3. Matching Any Character with Dot
 * The metacharacter ' . ' is a shorthand for a character class that matches any
 * character. Note that dots are not metacharacters when they are used within
 * character classes. Within character class, it is a simple character only.
 * 
 * For example, 06.24.2019 will match 06/24/2019 or 06-24-2019 or 06.24.2019.
 * But
 * 06[.]24[.]2019 will match only 06.24.2019.
 * 
 * 2.4. Matching Alternation – any one of several sub-expressions
 * Pipe symbol '|' allows you to combine multiple expressions into a single
 * expression that matches any of the individual ones.
 * 
 * For example, “Alex” and “Brian” are separate expressions, but "Alex|Brian" is
 * one expression that matches either of both.
 * 
 * Similar to dot, pipe is not metacharacter when it is used within character
 * class. Within character class, it is a simple character only.
 * 
 * For example, to match the words “First” or “1st”, we can write regex –
 * “(First|1st)” or in shorthand "(Fir|1)st".
 * 
 * 3. Java Regex API
 * Java has inbuilt APIs (java.util.regex) to work with regular expressions. We
 * do not need any 3rd party library to run regex against any string in Java.
 * 
 * Java Regex API provides 1 interface and 3 classes :
 * 
 * Pattern – A regular expression, specified as a string, must first be compiled
 * into an instance of this class. The resulting pattern can then be used to
 * create a Matcher object that can match arbitrary character sequences against
 * the regular expression.
 * Pattern p = Pattern.compile("abc");
 * Matcher m = p.matcher("abcabcabcd");
 * boolean b = m.matches(); //true
 * Matcher – This class provides methods that perform match operations.
 * MatchResult (interface) – It is result of a match operation. It contains
 * query methods used to determine the results of a match against a regular
 * expression.
 * PatternSyntaxException – It is an unchecked exception thrown to indicate a
 * syntax error in a regular-expression pattern.
 * Look at these classes and important methods in more detail.
 * 
 * 3.1. Pattern class
 * It represents the compiled representation of a regular expression. To use
 * Java regex API, we must compile the regular expression to this class.
 * 
 * After compilation, it’s instance can be used to create a Matcher object that
 * can match lines/strings against the regular expression.
 * 
 * Note that many matchers can share the same pattern. State information during
 * processing is kept inside Matcher instance.
 * 
 * Instances of this class are immutable and are safe for use by multiple
 * concurrent threads.
 * 
 * Predicate asPredicate() – Creates a Java 8 predicate which can be used to
 * match a string.
 * static Pattern compile(String regex) – It is used to compile the given
 * regular expression into a pattern.
 * static Pattern compile(String regex, int flags) – It is used to compile the
 * given regular expression into a pattern with the given flags.
 * int flags() – It is used to return this pattern’s match flags.
 * Matcher matcher(CharSequence input) – It is used to create a matcher that
 * will match the given input against this pattern.
 * static boolean matches(String regex, CharSequence input) – It is used to
 * compile the given regular expression and attempts to match the given input
 * against it.
 * String pattern() – It is used to return the regular expression from which
 * this pattern was compiled.
 * static String quote(String s) – It is used to return a literal pattern String
 * for the specified String.
 * String[] split(CharSequence input) – It is used to split the given input
 * sequence around matches of this pattern.
 * String[] split(CharSequence input, int limit) – It is used to split the given
 * input sequence around matches of this pattern.
 * Stream splitAsStream(CharSequence input) – Creates a stream from the given
 * input sequence around matches of this pattern.
 * 3.2. Matcher class
 * It is the main class that performs match operations on a string/line by
 * interpreting a Pattern. Once created, a matcher can be used to perform the
 * different kinds of match operations.
 * 
 * This class also defines methods for replacing matched sub-sequences with new
 * strings whose contents can, if desired, be computed from the match result.
 * 
 * Instances of the this class are not thread safe.
 * 
 * boolean find() – It is mainly used for searching multiple occurrences of the
 * regular expressions in the text.
 * boolean find(int start) – It is used for searching occurrences of the regular
 * expressions in the text starting from the given index.
 * int start() – It is used for getting the start index of a match that is being
 * found using find() method.
 * int end() – It is used for getting the end index of a match that is being
 * found using find() method. It returns index of character next to last
 * matching character.
 * int groupCount() – It is used to find the total number of the matched
 * subsequence.
 * String group() – It is used to find the matched subsequence.
 * boolean matches() – It is used to test whether the regular expression matches
 * the pattern.
 * boolean lookingAt() – Attempts to match the input sequence, starting at the
 * beginning of the region, against the pattern.
 * String quoteReplacement(String s) – Returns a literal replacement String for
 * the specified String.
 * Matcher reset() – Resets this matcher.
 * MatchResult toMatchResult() – Returns the match state of this matcher as a
 * MatchResult.
 * 
 * 
 * 
 * Regular Expression for Email Address:
 * ^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$
 * 
 * Regular Expression for Password Validation:
 * ((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})
 * 
 * Regular Expression for North American Phone Numbers:
 * ^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$
 * 
 * Regular Expression for US Postal Zip Codes:
 * ^[0-9]{5}(?:-[0-9]{4})?$
 * 
 * resources:
 * https://www.w3schools.com/java/java_regex.asp
 * 
 */

 import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static boolean isValidEmail(String email) {
        boolean flag = false;
        String regex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|in)";

        if (email.matches(regex)) {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("newport", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit Newport, Rhode Island!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        String regex1 = "Welcome.*";
        String str1 = "Welcome to RI";

        String regex2 = "Welcome to (RI|CT)";
        String str2 = "Welcome to RI";

        String regex3 = "[^Welcome]";
        String str3 = "1";

        System.out.println(str1.matches(regex1));
        System.out.println(str2.matches(regex2));
        System.out.println(str3.matches(regex3));

        String regex4 = "[Employee].?";
        String str4 = "Employeee";

        String regex5 = "[Employee].*";
        String str5 = "Employeee";

        String regex6 = "[P-Z]{8,10}";
        String str6 = "QRSTUVWX";

        String regex7 = "[Employee]+";
        String str7 = "Employeeeeee";

        System.out.println(str4.matches(regex4));
        System.out.println(str5.matches(regex5));
        System.out.println(str6.matches(regex6));
        System.out.println(str7.matches(regex7));

        String email = "bob456@gmail.com";
        
		System.out.println("The Email Id of the customer is " + email);
		if (isValidEmail(email))
			System.out.println("The Email Id is valid!");
		else
			System.out.println("The Email Id is invalid!");
	
    }
}

