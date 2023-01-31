package Zoom5_10_OOP.Car_Class_U78;

public class CarDemo {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
