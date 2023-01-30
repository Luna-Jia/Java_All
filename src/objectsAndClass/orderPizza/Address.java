package objectsAndClass.orderPizza;

import java.util.Scanner;

public class Address {

    // 1. create attributes
    private String street1;
    private String zip;
    private String city;
    private String state;
    public static Scanner kbInput = new Scanner(System.in);

    // 2. generate getter and setter
    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static Scanner getKbInput() {
        return kbInput;
    }

    public static void setKbInput(Scanner kbInput) {
        Address.kbInput = kbInput;
    }


    // Generate constructor

    // default constructor
    public Address() {
        System.out.println("Please enter the street:");
        setStreet1(kbInput.nextLine());

        System.out.println("Please enter the city:");
        setCity(kbInput.nextLine());

        System.out.println("Please enter the state:");
        setState(kbInput.nextLine());

        System.out.println("Please enter the zip code:");
        setZip(kbInput.nextLine());
    }

    public Address(String street1, String zip, String city, String state) {
        this.street1 = street1;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
