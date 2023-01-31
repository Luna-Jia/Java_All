package Zoom4_89Loops;

public class Zoom4_10Palindrome_String_loop {
    public static void main(String[] args) {
        String str = "abcdcba";

        boolean paliInd = true;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                paliInd = false;
                break;
            }
        }
        if (paliInd){
            System.out.println("It is a palindrome.");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}
