package fileTextIO;
public class WriteData {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) { // Lines 5–8 check whether the file scores.txt exists. If so, exit the program (line 7).
            System.out.println("File already exists");
            System.exit(1);
        }
        // Create a file // Invoking the constructor of PrintWriter may throw an I/O exception. Java forces you to write the code to deal with this type of exception. For simplicity, we declare throws
        //IOException in the main method header (line 3).
        // Invoking the constructor of PrintWriter will create a new file if the file does not exist. If the
        //file already exists, the current content in the file will be discarded without verifying with the user.
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        // You have used the System.out.print, System.out.println, and System.out
        //.printf methods to write text to the console output. System.out is a standard Java object for the console. You can create PrintWriter objects for writing text to any file using print, println, and printf (lines 16–19).

        // Close the file
        output.close(); // The close() method must be used to close the file (line 24). If this method is not invoked, the data may not be saved properly in the file.

    }
}
