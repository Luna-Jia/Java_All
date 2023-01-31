package MP1_mejia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your information");

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter the street:");
        String street = scanner.nextLine();

        System.out.println("Please enter the city:");
        String city = scanner.nextLine();

        System.out.println("Please enter the state:");
        String state = scanner.nextLine();

        System.out.println("Please enter the zip code:");
        String zipCode = scanner.nextLine();

        Address address = new Address(street,city,state,zipCode);

        Customer customer = new Customer(name,address);

        System.out.println("How many pizzas do you want to order?");

        int pizzaNum = scanner.nextInt();
        scanner.nextLine();

        int[] pizzas = new int[pizzaNum];
        Order order = new Order(pizzaNum,pizzas,customer);


        for (int i = 0; i < pizzaNum; i++) {
            System.out.println("info for pizza-" + (i+1));
            System.out.println("Please enter the size:");
            String size = scanner.nextLine();
            System.out.print("Please enter the number of toppings:");
            int toppingNum = scanner.nextInt();
            scanner.nextLine();
            System.out.println("choices are:\nMushroom\nPineapple\nZucchini\nTomato\nSpinach\nArtichoke\n");


            String[] toppings = new String[toppingNum];
            for (int j = 0; j < toppingNum; j++) {
                System.out.println("choose topping-"+(j+1));
                toppings[j] = scanner.nextLine();



            }
            Pizza pizza = new Pizza(size,toppingNum,toppings);


        }




        System.out.println("Order Confirmation:");
        System.out.println(customer.toString());
        System.out.println(pizzaNum + " pizza/s:");
        System.out.println(pizza.toString());












//        for (int i = 1; i <= pizzaNum; i++) {
//            System.out.println("info for pizza-" + i);
//            System.out.println("Please enter the size:");
////            System.out.println();
////            String size = scanner.nextLine();
//        }



//        System.out.print("Please enter the number of toppings:");
//            int toppingNum = scanner.nextInt();




    }
}
