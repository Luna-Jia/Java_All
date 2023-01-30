package array;
public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt(); // The program prompts the user to enter the array size(line 6)
        double[] numbers = new double[n]; // and creates an array with the specified size(line 7).
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers [i] = input.nextDouble(); // The program reads the input, stores numbers into the array (line 12),
            sum += numbers[i]; // adds each number to sum in line 13,
        }

        double average = sum / n; // and obtains the average (line 16)

        int count = 0; // The number of elements above average
        for (int i = 0; i < n; i++)
            if (numbers[i] > average) // above average?
                count++; // It then compares each number in the array with the average to count the number of values above the average (8-21)

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}
