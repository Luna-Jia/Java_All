package MP1_mejia;

public class Customer {
    private String name;
    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Customer[" +
                "name= " + name +
                ", address=" + address +
                ']';
    }
}
