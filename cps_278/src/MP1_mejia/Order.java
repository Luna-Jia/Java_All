package MP1_mejia;

import java.util.Arrays;

public class Order {
    private int pizzaNum;
    private int[] pizzas = new int[pizzaNum];
    private Customer customer;

    public Order(int pizzaNum, int[] pizzas, Customer customer) {
        this.pizzaNum = pizzaNum;
        this.pizzas = pizzas;
        this.customer = customer;
    }

    public int getPizzaNum() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many pizzas do you want to order?");
//        int pizzaNum = scanner.nextInt();
//        for (int i = 0; i < pizzaNum; i++){
//            System.out.println("info for pizza-" + i);
//            System.out.println("Please enter the size:");
//        }
        return pizzaNum;
    }

    public int[] getPizzas() {
        return this.pizzas;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public String toString() {
        return pizzaNum + " pizza/s: \n" + Arrays.toString(pizzas);
    }
}
