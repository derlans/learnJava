package 实验二;

public class RegularTriangle implements TwoDimensionalShape {
    private double side;
    public  RegularTriangle(double side){
        this.side=side;
    }

    @Override
    public double getArea() {
        return side*side*Math.pow(3,0.5)/4;
    }

    @Override
    public double getPerimeter() {
        return side*3;
    }
}
