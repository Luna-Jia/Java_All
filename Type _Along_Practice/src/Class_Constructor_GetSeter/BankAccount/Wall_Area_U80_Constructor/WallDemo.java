package Class_Constructor_GetSeter.BankAccount.Wall_Area_U80_Constructor;

public class WallDemo {
    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}
