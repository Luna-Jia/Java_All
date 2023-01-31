package zoo;

public class Snake extends Animal {
    private int num_fangs;

    public Snake() {
    }

    public Snake(String name, double weight, int age, int num_fangs) {
        super(name, weight, age);
        this.num_fangs = num_fangs;
    }

    @Override
    public String makeNoise() {
        return "Hisssssss";
    }

    @Override
    public String toString() {
        return "Snake{" +
                "num_fangs=" + num_fangs +
                "} " + super.toString();
    }
}
