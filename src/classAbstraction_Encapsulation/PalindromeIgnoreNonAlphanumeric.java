package classAbstraction_Encapsulation;
import java.util.Scanner;
public class PalindromeIgnoreNonAlphanumeric {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Display result
        System.out.println("Ignoring non-alphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
    }

    // Return true if a string is a palindrome
    public static boolean isPalindrome(String s) {
        // Create a new string by eliminating non-alphanumeric chars
        String s1 = filter(s);

        // Create a new string that is the reversal of s1
        String s2 = reverse(s1);

        // Check if the reversal is the same as the original string
        return s2.equals(s1);
    }

    // Create a new string by eliminating non-alphanumeric chars
    public static String filter(String s) { // The filter(String s)method(lines30–43)examines each character in string s and copies it to a string builder if the character is a letter or a numeric character.
        // Create a string builder
        StringBuilder stringBuilder = new StringBuilder();

        // Examine each char in the string to skip alphanumeric char
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }

        // Return a new filtered string
        return stringBuilder.toString(); // The filter method returns the string in the builder.
    }

    // Create a new string by reversing a specified string
    public static String reverse(String s) { //  The reverse(String s) method (lines 46–50) creates a new string that reverses the specified string s.
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse(); // Invoke reverse in StringBuilder
        return stringBuilder.toString(); // The filter and reverse methods both return a new string. The original string is not changed.
    }
}

// 检查是否是回文

// 10.11.3 Case Study: Ignoring Non-alphanumeric Characters When Checking Palindromes
//Listing 5.14, Palindrome.java, considered all the characters in a string to check whether it is a palindrome. Write a
// new program that ignores non-alphanumeric characters in checking whether a string is a palindrome.

//Here are the steps to solve the problem:

// 1. Filter the string by removing the non-alphanumeric characters. This can be done by creating an empty string builder,
// adding each alphanumeric character in the string to a string builder, and returning the string from the string builder.
// You can use the isLetterOrDigit(ch) method in the Character class to check whether character ch is a letter or a digit.

// 2. Obtain a new string that is the reversal of the filtered string.Compare the reversed string with the filtered string
// using the equals method.

//The complete program is shown in Listing 10.10.

// https://liveexample.pearsoncmg.com/liang/intro12e/html/PalindromeIgnoreNonAlphanumeric.html

// The program in Listing 5.14 checks whether a string is a palindrome by comparing pairs of characters from both ends
// of the string. Listing 10.10 uses the reverse method in the StringBuilder class to reverse the string, then compares
// whether the two strings are equal to determine whether the original string is a palindrome.