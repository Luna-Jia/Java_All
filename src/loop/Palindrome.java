package loop; import java.util.Scanner;

public class Palindrome {
    // Main method
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine(); // input string

        // The index of the first character in the string
        int low = 0; // low index
// The program uses two variables, low and high, to denote the positions of the two characters at the beginning and the end in a string s (lines 14 and 17)
        // The index of the last character in the string // Initially, low is 0 and high is s.length() – 1.
        int high = s.length() - 1; // high index
// The program uses a boolean variable isPalindrome to denote whether the string s is a palindrome. Initially, it is set to true (line 19).
        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) { // This process continues until (low >= high) or a mismatch is found (line 21). // When a mismatch is discovered (line 21),
                isPalindrome = false; // isPalindrome is set to false (line 22) and
                break; // the loop is terminated with a break statement (line 23).
            }
//  If the two characters at these positions match, increment low by 1 and decrement high by 1 (lines 26–27).
            low++; // update indices
            high--;
        }

        if (isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}

// A string is a palindrome if it reads the same forward and backward. The words “mom,” “dad,” and “noon,” for instance, are all palindromes.
//The problem is to write a program that prompts the user to enter a string and reports whether the string is a
// palindrome. One solution is to check whether the first character in the string is the same as the last character.
// If so, check whether the second character is the same as the second-to-last character. This process continues until
// a mismatch is found or all the characters in the string are checked, except for the middle character if the string
// has an odd number of characters. Listing 5.14 gives the program.