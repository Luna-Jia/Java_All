package MP1_mejia;

import java.util.Arrays;
import java.util.Scanner;

public class Pizza {
    private String size;
    private int toppingNum;
    private String[] toppings = new String[toppingNum];

    public Pizza(String size, int toppingNum, String[] toppings) {
        this.size = size;
        this.toppingNum = toppingNum;
        this.toppings = toppings;
    }

    public String getSize() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the size:");
//        String size = scanner.nextLine();
        return size;
    }

    public int getToppingNum() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the number of toppings:");
//        int toppingNum = scanner.nextInt();
        return toppingNum;
    }

    public String[] getToppings() {

//        Scanner scanner = new Scanner(System.in);
//
//        for (int i =0; i < toppingNum; i++) {
//            getSize();
//            System.out.println("choose topping-" +i);
//            toppings[i]= scanner.nextLine();
//        }
//        System.out.println("choices are:\nMushroom\nPineapple\nZucchini\nTomato\nSpinach\nArtichoke\n");

        return toppings;
    }

    @Override
    public String toString() {
        String pizzaStr="";
        for (String eachPizza:toppings) {
            pizzaStr = pizzaStr + eachPizza + "\n";
        }
        return size + " " + pizzaStr;
    }
}
