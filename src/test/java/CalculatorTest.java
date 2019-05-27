import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(8, calculator.multiply(2, 4));
    }

    @Test
    public void canDivide(){
        assertEquals(2.00, calculator.divide(8, 4), 0.00);
    }

    @Test
    public void canDivideModules(){
        assertEquals(1.5, calculator.divide(3, 2), 0.5);
    }

}
