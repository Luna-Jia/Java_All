package temperature;
import java.util.Scanner;

public class TemperatureProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        double sumTempC = 0;
        double sumTempF = 0;

        while (true){

            System.out.print("Enter Temp in Centigrade or <= -100 to quit: ");
            double tempC = sc.nextDouble();
            double tempF = (9.0/5.0)*tempC+32.0;
            if (tempC <= -100)
                break;
            if (tempC>-100) {
                counter++;

                sumTempC += tempC;
                sumTempF += tempF;

                System.out.println("Temperature: F ( "+ tempF + " )  C ( " + tempC + " )");
            }

        }
        System.out.println("Average: Centigrade ( " + sumTempC/counter + " ) Average: Fahrenheit ( " + sumTempF/counter + " )");

        sc.close();

    }
}
