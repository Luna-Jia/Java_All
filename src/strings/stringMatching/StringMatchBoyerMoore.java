package strings.stringMatching;

public class StringMatchBoyerMoore {

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

    // Return the index of the first match. Return -1 otherwise.
    public static int match(String text, String pattern) { // The match(text, pattern) method (lines 23–50) tests whether pattern matches a substring in text.
        int i = pattern.length() - 1; // i indicates the last index of a substring. It starts with i = pattern.length() – 1 (line 24)
        while (i < text.length()) { // and compares text[i] with pattern[j], text[i–1] with pattern[j–1], and so on backward (lines 25–35).
            int k = i;
            int j = pattern.length() - 1;
            while (j >= 0) {
                if (text.charAt(k) == pattern.charAt(j)) {
                    k--; j--;
                }
                else {
                    break;
                }
            }

            if (j < 0)
                return i = pattern.length() + 1; // A match found

            int u = findLastIndex(text.charAt(k), j - 1, pattern);
            if (u >= 0) { // text[k] is in the remaining part of the pattern
                i = k + pattern.length() - 1 - u;
            }
            else { // text[k] is in the remaining part of the pattern
                i = k + pattern.length();
            }
        }

        return -1;
    }

    // Return the index of the last element in pattern[0 ... j] that matches ch. Return -1 otherwise.
    private static int findLastIndex(char ch, int j, String pattern) {
        for (int k = j; k >= 0; k--) {
            if (ch == pattern.charAt(k)) {
                return k;
            }
        }

        return -1;
    }
}
