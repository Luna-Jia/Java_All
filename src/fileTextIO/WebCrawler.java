package fileTextIO;
import java.util.Scanner;
import java.util.ArrayList;
public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: "); // The program prompts the user to enter a starting URL (lines 7 and 8)
        String url = input.nextLine(); // enter a URL
        crawler(url); // and invokes the crawler(url) method to traverse the Web (line 9). // Traverse the Web from a starting url // crawl from this URL
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>(); // list of pending URLs
        ArrayList<String> listOfTraversedURLs = new ArrayList<>(); // list of traversed URLs

        listOfPendingURLs.add(startingURL); // add starting URL // The crawler(url) method adds the starting url to listOfPendingURLs (line 16)
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) { // and repeatedly process each URL in listOfPendingURLs in a while loop (lines 17–29).
// The program terminates when the number of traversed URLs reaches 100 (line 17).
            String urlString = listOfPendingURLs.remove(0); // get the first URL // It removes the first URL in the list (line 19)
            if (!listOfTraversedURLs.contains(urlString)) { // and processes the URL if it has not been processed (lines 20–28).
                listOfTraversedURLs.add(urlString); // URL traversed // To process each URL, the program first adds the URL to listOfTraversedURLs (line 21). This list stores all the URLs that have been processed.
                System.out.println("Crawl " + urlString);
// The program uses a foreach loop to add each URL in the page into listOfPendingURLs if it is not in listOfTraversedURLs (lines 24–27).
                for (String s: getSubURLs(urlString)) { // The getSubURLs(url) method returns a list of URLs in the webpage for the specified URL (line 24).
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine(); // The getSubURLs(url) method reads each line from the webpage (line 40)
                current = line.indexOf("http:",current); // and searches for the URLs in the line (line 41).
                while (current > 0) {
                    int endIndex = line.indexOf("\"",current); // Note a correct URL cannot contain line break characters. Therefore, it is sufficient to limit the search for a URL in one line of the text in a webpage. For simplicity, we assume that a URL ends with a quotation mark " (line 43).
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex)); //  The method obtains a URL and adds it to a list (line 45).
                        current = line.indexOf("http:", endIndex); // A line may contain multiple URLs. The method continues to search for the next URL (line 46).
                    }
                    else
                        current = -1; // If no URL is found in the line, current is set to –1 (line 49).
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list; // The URLs contained in the page are returned in the form of a list (line 57).
    }
}

// a simple program to traverse the Web.
// The program follows the URLs to traverse the Web. To ensure that each URL is traversed only once, the program
// maintains two lists of URLs. One list stores the URLs pending for traversing, and the other stores the URLs that have
// already been traversed.









































