package fileTextIO;
import java.util.Scanner;
public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next(); // The program prompts the user to enter a URL string (line 6)

        try {
            java.net.URL url = new java.net.URL(URLString); // and creates a URL object (line 9).
            int count = 0; // After a URL object is created, you can use the openStream() method defined in the URL class to open an input stream and use this stream to create a Scanner object as follows:
            Scanner input = new Scanner(url.openStream()); // The program creates a Scanner object from the input stream for the URL (line 11).
            while (input.hasNext()) { // Now you can read the data from the input stream just like from a local file.
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");
        }
        catch (java.net.MalformedURLException ex) { // The constructor will throw a java.net.MalformedURLException (line 19) if the URL isn’t formed correctly.
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException ex) { //  If the URL is formed correctly but does not exist, an IOException will be thrown (line 22).
            System.out.println("I/O Errors: no such file");
        }
    }
}

//  This program prompts the user to enter a URL and displays the size of the file.