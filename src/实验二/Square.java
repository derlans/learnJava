package 实验二;

public class Square implements TwoDimensionalShape {
    private double side;
    public  Square(double side){
        this.side=side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
}
