package Marathon.Day9.Task2;

public class Triangle extends Figure{
    int long1;
    int long2;
    int long3;
    public Triangle(String color) {
        super(color);
    }

    @Override
    public double area() {
        return (long1*long2*Math.sin(long1)/2);
    }

    @Override
    public double perimetr() {
        return long1+long2+long3;
    }

    public Triangle(String color, int long1, int long2, int long3) {
        super(color);
        this.long1 = long1;
        this.long2 = long2;
        this.long3 = long3;
    }
}
