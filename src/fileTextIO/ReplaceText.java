package fileTextIO;
import java.io.*;
import java.util.*;
public class ReplaceText {
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 4) { // The program checks the number of arguments passed to the main method (lines 7–11)
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");

            System.exit(1);
        } // In a normal situation, the program is terminated after a file is copied. The program is terminated abnormally if the command-line arguments are not used properly (lines 7–11)
// checks whether the source and target files exist (lines 14–25),
        // Check if source file exists
        File sourceFile = new File(args[0]); // if the source file does not exist (lines 14–18),
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) { // or if the target file already exists (lines 22–25).
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3); //  The exit status codes 1, 2, and 3 are used to indicate these abnormal terminations (lines 10, 17, and 24).
        }

        try( // try-with-resources
                // Create input and output files
                Scanner input = new Scanner(sourceFile); // creates a Scanner for the source file (line 29)
                PrintWriter output = new PrintWriter(targetFile); // creates a PrintWriter for the target file (line 30)
                ) {
            while (input.hasNext()) {
                String s1 = input.nextLine(); // and repeatedly reads a line from the source file (line 33)
                String s2 = s1.replaceAll(args[2], args[3]); // replaces the text (line 34)
                output.println(s2); // and writes a new line to the target file (line 35)
            }
        }
    }
}
