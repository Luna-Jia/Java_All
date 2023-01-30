package objectsAndClass.orderPizza;

import java.util.Arrays;
import java.util.Scanner;

public class Order {
    public static Scanner kbInput = new Scanner(System.in);
    private Customer customer;
    private int numbOfPizza;
    private Pizza[] pizza;

    public int getNumbOfPizza() {
        return numbOfPizza;
    }

    public void setNumbOfPizza(int numbOfPizza) {
        this.numbOfPizza = numbOfPizza;
    }

    public void enterCustomer() {
        System.out.println("Please enter your information");
        setCustomer(new Customer());
    }

    public Order() {
        enterCustomer();
        orderPizza();
    }

    public static Scanner getKbInput() {
        return kbInput;
    }

    public static void setKbInput(Scanner kbInput) {
        Order.kbInput = kbInput;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Pizza[] getPizza() {
        return pizza;
    }

    public void setPizza(Pizza[] pizza) {
        this.pizza = pizza;
    }

    public void orderPizza() {
        System.out.println("How many pizzas do you want to order?");
        setNumbOfPizza(kbInput.nextInt());
        kbInput.nextLine();
        pizza = new Pizza[numbOfPizza];
        for (int i = 0; i < numbOfPizza; i++) {
            System.out.println("info for pizza" + (i + 1));
            pizza[i] = new Pizza();
        }
    }

    @Override
    public String toString() {
        String pizzaStr="";
        for (Pizza eachPizza:pizza) {
            pizzaStr = pizzaStr + eachPizza + "\n";
        }
        return "your info:\n" + customer.toString() + "\n" + getNumbOfPizza()+"pizza/s \n" + pizzaStr;
    }

    public static void main(String[] args) {
        Order pizzaOrder = new Order();
        System.out.println(pizzaOrder);
    }
}
