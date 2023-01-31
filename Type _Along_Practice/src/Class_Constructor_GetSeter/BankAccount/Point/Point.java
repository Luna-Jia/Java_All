package Class_Constructor_GetSeter.BankAccount.Point;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){
        double distance = Math.sqrt(x*x+y*y);
        return distance;
    }

    public double distance (int x, int y){
        double distance = Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
        return distance;
    }

    public double distance(Point another) {
        return distance(another.x, another.y);
    }

}
