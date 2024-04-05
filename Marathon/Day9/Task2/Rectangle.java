package Marathon.Day9.Task2;

public class Rectangle extends Figure{
    int width;
    int height;
    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimetr() {
        return (width+height)*2;
    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
}
