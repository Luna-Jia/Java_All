package loop; public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) { // count prime numbers
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) { // check primeness // To determine whether a number is prime, check whether it is divisible by a number between 2 and number/2 inclusive (lines 16–21).
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false // If so, it is not a prime number (line 18);
                    break; // Exit the for loop // The program uses the break statement in line 19 to exit the for loop as soon as the number is found to be a non-prime.
                }
            }

            // Display the prime number and increase the count
            if (isPrime) { // display if prime
                count++; // Increase the count
                // otherwise, it is a prime number. For a prime number, display it (lines 27–33).
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) { // If the count is divisible by 10, display the number followed by a newline (lines 27–30). The program ends when the count reaches 50.
                    // Display the number and advance to the new line
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }

            // Check if the next number is prime
            number++;
        }
    }
}

// An integer greater than 1 is prime if its only positive divisor is 1 or itself. For example, 2, 3, 5, and 7 are prime
// numbers, but 4, 6, 8, and 9 are not.
//The problem is to display the first 50 prime numbers in 5 lines, each of which contains 10 numbers.