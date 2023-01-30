package binaryIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        try ( // Create a random access file
              RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw"); // A RandomAccessFile is created for the file named inout.dat with mode rw to allow both read and write operations in line 9.
                ) {
            // Clear the file to destroy the old contents if exists
            inout.setLength(0); // inout.setLength(0) sets the length to 0 in line 12. This, in effect, deletes the old contents of the file.

            // Write new integers to the file
            for (int i = 0; i < 200; i++) // The for loop writes 200 int values from 0 to 199 into the file
                inout.writeInt(i);

            // Display the current length of the file
            System.out.println("Current file length is " + inout.length()); // Since each int value takes 4 bytes, the total length of the file returned from inout.length() is now 800

            // Retrieve the first number
            inout.seek(0); // Move the file pointer to the beginning
            System.out.println("The first number is " + inout.readInt()); // inout.readInt() reads the first value in line 23 and moves the file pointer to the next number.

            // Retrieve the second number
            inout.seek(1 * 4); // Move the file pointer to the second number
            System.out.println("The second number is " + inout.readInt()); // The second number is read in line 27.

            // Retrieve the tenth number
            inout.seek(9 * 4); // Move the file pointer to the tenth number
            System.out.println("The tenth number is " + inout.readInt()); // inout.readInt() reads the tenth number and moves the file pointer to the eleventh number in line 31.

            // Modify the eleventh number
            inout.writeInt(555); // inout .write(555) writes a new eleventh number at the current position (line 34).The previous eleventh number is deleted.

            // Append a new number
            inout.seek(inout.length()); // Move the file pointer to the end
            inout.writeInt(999); // inout.writeInt(999) writes a 999 to the file

            // Display the new length
            System.out.println("The new length is " + inout.length()); // Now the length of the file is increased by 4, so inout.length() returns 804.

            // Retrieve the new eleventh number
            inout.seek(10 * 4); // Move the file pointer to the eleventh number
            System.out.println("The eleventh number is " + inout.readInt()); // The new eleventh number, 555, is displayed in line 45.
        }
    }
}
