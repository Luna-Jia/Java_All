package binaryIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {

    public static void main(String[] args) throws ClassNotFoundException, IOException { // Since ClassNotFoundException is a checked exception, the main method declares to throw it
        try ( // Create an input stream for file object.dat
              ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat")); // An ObjectInputStream is created to read input from object.dat
                ) {
            // Read a string, double value, and object from the file
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date)(input.readObject()); // The readObject() method may throw java.lang.ClassNotFoundException
            System.out.println(name + " " + score + " " + date);
        }
    }
}
