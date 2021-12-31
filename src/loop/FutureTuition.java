package loop;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Year 0
        int year = 0; // Keep computing the tuition for a new year until it is at least 20000. By then, you will know how many years it will take for the tuition to be doubled.
        while (tuition < 20000) { // loop // The while loop (line 7-10) is used to repeatedly compute the tuition for a new year.The loop terminates when the tuition is greater than or equal to 20000.
            tuition = tuition * 1.07; // next year's tuition // The tuition for the second year is the tuition for the first year * 1.07. The tuition for a future year is the tuition of its preceding year * 1.07.
            year++;
        }

        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year );
    }
}

// Suppose the tuition for a university is $10,000 this year and tuition increases 7% every year. In how many years will the tuition be doubled?