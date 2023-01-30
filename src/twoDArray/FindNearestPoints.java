package twoDArray;
import java.util.Scanner;
public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: "); // 1. The program prompts the user to enter the number of points (lines 6 and 7).
        int numberOfPoints = input.nextInt(); // prompt 用户输入点数

        // Create an array to store points
        double[][] points = new double[numberOfPoints][2];// 第一个【】表示有几个点，是由user Input 决定的。 【2】表示有2列，x, y.
        System.out.print("Enter " + numberOfPoints + " points: "); // 显示用户输入的点数。
        for (int i = 0; i < points.length;i++) { // read points // 2. The points are read from the console and stored in a two-dimensional array named points (lines 12–15).
            points[i][0] = input.nextDouble(); // 用户输入的数字，每两个成为x，y 被存为一个点。（line 13-14）为每行的内容，一个点的x，y。
            points[i][1] = input.nextDouble();
        }

        // p1 and p2 are the indices in the points array
        int p1 = 0, p2 = 1; // Initial two points // track two points // 4. and the indices of these two points in the points array are stored in p1 and p2 (line 18).
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0],points[p2][1]); // Initialize shortestDistance // track shortestDistance
// 3. The program uses the variable shortestDistance (line 19) to store the distance between the two nearest points,

        // Compute distance for every two points // 4. For each point at index i, the program computes the distance between points[i] and points[j] for all j > i (line 23-34).
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find distance // distance between two points


                if (shortestDistance > distance) {
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                    shortestDistance = distance; // Update shortestDistance
                }
            }
        }

        // Display result
        System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
    }



    // Compute the distance between two points (x1, y1) and (x2, y2)
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
