package Marathon.Day9.Task2;

public class Circle extends Figure{
    int rad;
    public Circle(String color) {
        super(color);
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(rad,2));
    }

    @Override
    public double perimetr() {
        return 2*rad*Math.PI;
    }

    public Circle(String color, int rad) {
        super(color);
        this.rad = rad;
    }
}
