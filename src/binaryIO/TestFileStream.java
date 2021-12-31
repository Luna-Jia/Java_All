package binaryIO;
import java.io.*;
public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (
            // Create an output stream to the file
            FileOutputStream output = new FileOutputStream("temp.dat"); // A FileOutputStream is created for the file temp.dat in line 7.
        ) {
            // Output values to the file
            for (int i = 1; i <= 10; i++) //  The for loop writes 10 byte values into the file (lines 10 and 11).
                output.write(i);
        }

        try (
                // Create an input stream for the file
                FileInputStream input = new FileInputStream("temp.dat"); // Line 16 creates a FileInputStream for the file temp.dat.
                ) {
                    // Read values from the file
                    int value; // Values are read from the file and displayed on the console in lines 19–21.
                    while ((value = input.read()) != -1) // The expression ((value = input.read()) != −1) (line 20) reads a byte from input.read(), assigns it to value, and checks whether it is −1. The input value of −1 signifies the end of a file.
                        System.out.print(value + " ");
                  }
    }
}

// uses binary I/O to write 10 byte values from 1 to 10 to a file named temp.dat
// and reads them back from the file.

