package test;
import org.junit.Test;
import 实验二.*;
import static org.junit.Assert.assertEquals;

public class TwoDimensionalShapeTest {
    public Square square=new Square(2);
    public RegularTriangle regularTriangle=new RegularTriangle(2);
    public RegularHexagon regularHexagon=new RegularHexagon(2);
    @Test
    public void testSquare(){
        assertEquals( square.getArea(),4,0.001);
        assertEquals( square.getPerimeter(),8,0.001);
    }
    @Test
    public void testRegularTriangle(){
        assertEquals( regularTriangle.getArea(),Math.pow(3,0.5),0.001);
        assertEquals( regularTriangle.getPerimeter(),6,0.001);
    }
    @Test
    public void testRegularHexagon(){
        assertEquals( regularHexagon.getArea(),Math.pow(3,0.5)*6,0.001);
        assertEquals( regularHexagon.getPerimeter(),12,0.001);
    }
    
}
