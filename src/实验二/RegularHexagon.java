package 实验二;

public class RegularHexagon implements TwoDimensionalShape{
    private double side;
    public  RegularHexagon(double side){
        this.side=side;
    }

    @Override
    public double getArea() {
        return side*side*Math.pow(3,0.5)*1.5;
    }

    @Override
    public double getPerimeter() {
        return side*6;
    }
}
