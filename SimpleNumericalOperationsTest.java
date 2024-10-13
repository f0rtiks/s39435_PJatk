import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleNumericalOperationsTest {
    @Test
    void AdditionTest(){
        var calculator = new SimpleNumericalOperations();
        assertEquals(4, calculator.add(2,2));
        assertEquals(6, calculator.add(2,4));
        assertEquals(10, calculator.add(0,10));
    }

    @Test
    void PositiveTest(){
        var calculator = new SimpleNumericalOperations();
        assertTrue(calculator.isPositive(2));
    }
    @Test
    void NegativeTest(){
        var calculator = new SimpleNumericalOperations();
        assertTrue(calculator.isNegative(-1));
    }

}