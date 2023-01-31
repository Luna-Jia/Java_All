public class StringEqualityTest2 {
    public static void main(String[] args){
        String x1 = "abcd";
        String x2 = "ab";
        x2 += "cd";
        if (x1.equals(x2)) System.out.println("true");
        else System.out.println("false");
    }
}
