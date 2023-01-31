package zoo;

abstract public class Animal {
    private String name;
    private double weight;
    private int age;

    public Animal() {
    }

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public abstract String makeNoise();

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
