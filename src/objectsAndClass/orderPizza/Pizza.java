package objectsAndClass.orderPizza;

import java.util.Arrays;
import java.util.Scanner;

public class Pizza {

    private enum Size {L, M, S};
    private Size size;
    private enum Topping {Mushroom,Pineapple,Zucchini,Tomato,Spinach,Artichoke};
    private Topping[] toppings;
    private int numOfToppings;
    public static Scanner kbInput = new Scanner(System.in);

    public Pizza() {
        System.out.println("Please enter the size:");
        size = Size.valueOf(kbInput.nextLine());

        System.out.println("Please enter the number of toppings:");
        numOfToppings = kbInput.nextInt();

        kbInput.nextLine();

        toppings = new Topping[numOfToppings];
        System.out.println("choices are:");

        for (Topping topping:Topping.values()) {
            System.out.println(topping);
        }
        for (int i =0; i < numOfToppings; i++) {
            System.out.println("enter a topping");
            toppings[i]=Topping.valueOf(kbInput.nextLine());
        }
    }

    @Override
    public String toString() {
        String toppingStr = "";
        for (Topping topping: toppings){
            toppingStr = toppingStr + topping + " ";
        }
        return size + " " + toppingStr;
    }
}
