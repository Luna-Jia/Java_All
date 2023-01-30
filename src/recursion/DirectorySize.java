package recursion;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args) {
        // Prompt the user to enter a directory or a file
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display the size
        System.out.println(getSize(new File(directory)) + " bytes");
    }

    public static long getSize(File file) {
        long size = 0; // Store the total size of all files
        if (file.isDirectory()) { // If the file object represents a directory
            File[] files = file.listFiles(); // All files and subdirectories // The listFiles() method returns an array of File objects under a directory.
            for (int i = 0; files != null && i < files.length; i++) { // The length() method returns the size of a file.
                size += getSize(files[i]); // Recursive call //  each sub-item (file or subdirectory) in the directory is recursively invoked to obtain its size
            }
        }
        else { // Base case //  If the file object represents a file
            size += file.length(); //  the file size is obtained and added to the total size
        }

        return size;
    }
}
