package fileTextIO;
public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores2.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        // A resource is declared and created in the parentheses following the keyword try. The resources must be a subtype of AutoCloseable such as a PrinterWriter that has the close() method.
        // A resource must be declared and created in the same statement, and multiple resources can be declared and created inside the parentheses。
        // Create a file
        try ( java.io.PrintWriter output = new java.io.PrintWriter(file) ) // declare/create resource{ // The statements in the block (lines 14–19) immediately following the resource declaration use the resource. After the block is finished, the resource’s close()method is automatically invoked to close the resource.
            { // Write formatted output to the file
            output.print("John T Smith "); // use the resource
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }

    //  Using try-with resources can not only avoid errors,
    // but also make the code simpler. Note the catch clause may be omitted in a try-with-resources statement.
}

// Note that (1) you have to declare the resource reference variable and create the resource altogether in the try(...) clause;
// (2) the semicolon (;) in last statement in the try(...) clause may be omitted;
// (3) You may create multiple AutoCloseable resources in the the try(...) clause;
// (4) The try(...) clause can contain only the statements for creating resources.
