package recursion;

public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private static boolean isPalindrome(String s, int low, int high) { // 18.5 Recursive Helper Methods
        if (high <= low) // Base case
            return true;
        else if (s.charAt(low) != s.charAt(high)) // Base case
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }

    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
    }
}

//Two overloaded isPalindrome methods are defined. The first method isPalindrome (String s) checks whether a string is a
// palindrome and the second method isPalindrome (String s, int low, int high) checks whether a substring s(low..high)
// is a palindrome. The first method passes the string s with low = 0 and high = s.length() – 1 to the second method.
// The second method can be invoked recursively to check a palindrome in an ever-shrinking substring. It is a common
// design technique in recursive programming to define a second method that receives additional parameters. Such a
// method is known as a recursive helper method.
