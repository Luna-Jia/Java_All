package twoDArray;

public class LargestRowSum {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println(); // 另起一行，outer-loop为row
        }

        int maxRow = 0; // 设置初始值为0
        int indexOfMaxRow = 0;

        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        } // Row 0 的 Sum， loop through all column in row 0.

        for (int row = 1; row < matrix.length; row++) { // Outer-loop, 从row1开始，loop through所有行。
            int totalOfThisRow = 0; // rowSum 初始值设为0。

            for (int column = 0; column < matrix[row].length; column++) { // Inner-loop，loop through 各行的所有列
                totalOfThisRow += matrix[row][column]; // 叠加计算此行的sum。
                if (totalOfThisRow > maxRow) { // 若total比max大，
                    maxRow = totalOfThisRow; // 就把total的值附到max上。
                    indexOfMaxRow = row; // 把outer-loop循环的row附到indexMax上。
                }
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }
}

// https://mediaplayer.pearsoncmg.com/assets/secs-liang-Find_the_Row_with_the_Largest_Sum

// Find the row containing the largest sum
// Print the row index

