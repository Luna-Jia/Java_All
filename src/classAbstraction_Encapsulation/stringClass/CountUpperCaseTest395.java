package classAbstraction_Encapsulation.stringClass;

public class CountUpperCaseTest395 {
    public static void main(String[] args) {
        String s = "Hi, Good Morning";
        System.out.println(method(s));
    }

    public static int method(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        }
        return count;
    }
}