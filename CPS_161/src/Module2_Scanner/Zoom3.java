package Module2_Scanner;

import java.util.Scanner; // import java Scanner class. 跟在package之后，class之前。


public class Zoom3 {

    public static void main(String[] args) {

    Scanner kbInput = new Scanner (System.in); // constructing or instantiate
    // I am creating or constructing a real object which has kbInput in the class scanner. So now I can use this object to do things.
    // It is like that this is a variable, but I have to have a value to use the variable.
    // Now is like that this is a type, but I have to have an object to use it.

      /*  int inputNumb;
    System.out.println ("Please enter an integer: ");
    kbInput.nextInt(); // call nextInt, you will receive an input from keyboard. Treat it as an integer.
    inputNumb = kbInput.nextInt();
     // read string input.
    System.out.println("you just entered " + inputNumb);

       */

    String fruit;
    int amount;

        System.out.println("Enter the fruit type: ");
        fruit= kbInput.nextLine();
        kbInput.nextLine();
        System.out.println("enter the amount: ");
        amount = kbInput.nextInt();
        kbInput.nextLine(); // 没有这一行，刚才输入的enter 就被当成nextline，就不会等我们输入。
        System.out.println("You entered " + amount + " " + fruit);

        // print VS println

        // \ escape key
        System.out.println("abc\"");
        // escape 本身的特殊意义，输出literally 那个字符，如"。

    }

}
