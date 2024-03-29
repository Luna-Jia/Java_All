package strings.stringMatching;
public class StringMatch {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string text: ");
        String text = input.nextLine();
        System.out.print("Enter a string pattern: ");
        String pattern = input.nextLine();

        int index = match(text, pattern);
        if (index >= 0)
            System.out.println("matched at index " + index);
        else
            System.out.println("unmatched");
    }

    // Return the index of the first match. -1 otherwise.
    public static int match(String text, String pattern) { // The match(text, pattern) method (lines 17–24) tests whether pattern matches a sub- string in text.
        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            if (isMatched(i, text, pattern))
                return i;
        }
        return -1;
    }

    // Test if pattern matches starting at index i
    private static boolean isMatched(int i, String text, String pattern) { //  The isMatched(i, text, pattern) method (lines 27–35) tests whether pattern matches text[i ... i + m – 1] starting at index i.
        for (int k = 0; k < pattern.length(); k++) {
            if (pattern.charAt(k) != text.charAt(i+k)) {
                return false;
            }
        }

        return true;
    }
}
