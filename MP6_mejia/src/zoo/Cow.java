package zoo;

public class Cow extends Animal {

    private int num_spots;

    public Cow() {
    }

    public Cow(String name, double weight, int age, int num_spots) {
        super(name, weight, age);
        this.num_spots = num_spots;
    }

    @Override
    public String makeNoise() {
       return "Moooo";
    }

    @Override
    public String toString() {
        return "Cow{" +
                "num_spots=" + num_spots +
                "} " + super.toString();
    }
}
