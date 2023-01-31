public class Main {

    public static void main(String[] args) {

        String s = "bAnana";

        int countC = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == 'c') {
                countC = countC + 1;
            }
            if (i == s.length() - 1)
                System.out.println(countC);
        }
    }
}
