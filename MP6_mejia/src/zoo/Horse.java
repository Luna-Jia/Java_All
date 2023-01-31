package zoo;

public class Horse extends Animal {
    private double top_speed;

    public Horse() {
    }

    public Horse(String name, double weight, int age, double top_speed) {
        super(name, weight, age);
        this.top_speed = top_speed;
    }

    @Override
    public String makeNoise() {
        return "Whinny";
    }

    @Override
    public String toString() {
        return "Horse{" +
                "top_speed=" + top_speed +
                "} " + super.toString();
    }
}
