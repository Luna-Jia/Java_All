package twoDArray;
import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution(); // read input // // The program invokes the readASolution() method (line 7) to read a Sudoku solution and return a two-dimensional array representing a Sudoku grid.

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution"); // solution valid?
    }

    /** Read a Sudoku solution from the console */
    public static int[][] readASolution() { // read solution
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }
// The isValid(grid) method checks whether the values in the grid are valid by verifying that each value is between 1 and 9, and that each value is valid in the grid (lines 27–34).
    /** Check whether a solution is valid */
    public static boolean isValid(int[][] grid) { // check solution
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] < 1 || grid[i][j] > 9 // 情况为不属于1-9，或者非isValid(i, j, grid)
                        || !isValid(i, j, grid))
                    return false; // 在if的这些个情况下，return false。
        return true; // The solution is valid // 否则，return true。
    }

    /** Check whether grid[i][j] is valid in the grid */
    public static boolean isValid(int i, int j, int[][] grid) { // overloaded isValid method
        // Check whether grid[i][j] is valid at the i's row
        for (int column = 0; column < 9; column++) // It checks whether grid[i][j] appears more than once in row i (lines 39–41),
            if (column != j && grid[i][column] == grid[i][j])
                return false;

        // Check whether grid[i][j] is valid at the j's column
        for (int row = 0; row < 9; row++)
            if (row != i && grid[row][j] == grid[i][j])
                return false;

        // Check whether grid[i][j] is valid in the 3 by 3 box
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                if (!(row == i && col == j) && grid[row][col] == grid[i][j])
                    return false;

        return true; // The current value at grid[i][j] is valid
    }
}