package casting;
import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("四舍 Sales tax is $" + (int)(tax * 100) / 100.0); // 四舍
        System.out.println("五入 Sales tax is $" + (int)(tax * 100 + 0.5) / 100.0);

    }
}

// The program displays the sales tax with two digits after the decimal point.