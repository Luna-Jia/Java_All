package polymorphism_Udemy.exe39Car;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " -> brake()";
    }
}

class Mitsubishi extends Car{
    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " -> brake()";
    }

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);


    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class ExeCar{
    public static void main(String[] args) {

            polymorphism_Udemy.exe39Car.Car car = new polymorphism_Udemy.exe39Car.Car(8,"Base car");
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());

            polymorphism_Udemy.exe39Car.Mitsubishi mitsubishi = new polymorphism_Udemy.exe39Car.Mitsubishi(6,"Outlander VRW 4WD");
            System.out.println(mitsubishi.startEngine());
            System.out.println(mitsubishi.accelerate());
            System.out.println(mitsubishi.brake());

            polymorphism_Udemy.exe39Car.Ford ford = new polymorphism_Udemy.exe39Car.Ford(6,"Ford Falcon");
            System.out.println(ford.startEngine());
            System.out.println(ford.accelerate());
            System.out.println(ford.brake());

            polymorphism_Udemy.exe39Car.Holden Holden = new polymorphism_Udemy.exe39Car.Holden(6,"Holden Commodore");
            System.out.println(Holden.startEngine());
            System.out.println(Holden.accelerate());
            System.out.println(Holden.brake());

    }

        }
