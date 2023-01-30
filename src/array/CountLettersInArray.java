package array;

import methods.RandomCharacter;

public class CountLettersInArray {
    /** Main method */
    public static void main(String[] args) {
        // Declare and create an array
        char[] chars = createArray(); // 2. Line 9 invokes the method and assigns the array to chars.

        // Display the array
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        // Count the occurrences of each letter
        int[] counts = countLetters(chars);

        // Display counts
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
        System.out.println("haha"+counts[0]);
    }

    /** Create an array of characters */
    public static char[] createArray() { // 1. The createArray method (lines 25–36) generates an array of 100 random lowercase letters.
        // Declare an array of characters and create it
        char[] chars = new char[100];

        // Create lowercase letters randomly and assign them to the array
        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
// 3. Invoking getRandomLowerCaseLetter() (line 31) returns a random lowercase letter. This method is defined in the RandomCharacter class in Listing 6.10.
        return chars; // Return the array
    }

    /** Display the array of characters */
    public static void displayArray(char[] chars) {
        // Display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }
// 4. The countLetters method (lines 48–57) returns an array of 26 int values, each of which stores the number of occurrences of a letter. The method processes each letter in the array and increases its count by one.
    /** Count the occurrences of each letter */
    public static int[] countLetters(char[] chars) {
        // Declare and create an array of 26 int
        int[] counts = new int[26];

        // For each lowercase letter in the array, count it
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }

    /** Display counts */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }
}