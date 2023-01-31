package Class_Constructor_GetSeter.BankAccount.Car;

public class Car_Demo {
    public static void main(String[] args){
        Car porsche = new Car(); // create an object called porsche
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
