package final_exam;

abstract class Container {
    private double height;

    public Container(double height) {
        this.height = height;
    }

    public abstract double getTopArea();
    public abstract double getTopPerimeter();

    public double getVolume(){
        return height*getTopArea();
    }

    public double getSurFaceArea(){
        return 2*getTopArea() + height*getTopPerimeter();
    }
}

class CircularContainer extends Container{
    private double radius;

    public CircularContainer(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getTopArea() {
        return 0;
    }

    @Override
    public double getTopPerimeter() {
        return 0;
    }
}
