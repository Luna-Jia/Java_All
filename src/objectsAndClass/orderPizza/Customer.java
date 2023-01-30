package objectsAndClass.orderPizza;

import java.util.Scanner;

public class Customer {

    private String name;
    private Address address;

    public static Scanner kbInput = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static Scanner getKbInput() {
        return kbInput;
    }

    public static void setKbInput(Scanner kbInput) {
        Customer.kbInput = kbInput;
    }

    public Customer() {
        System.out.println("Please enter your name:");
        setName(kbInput.nextLine());

        System.out.println("Please enter your address:");
        setAddress(new Address());
    }

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
