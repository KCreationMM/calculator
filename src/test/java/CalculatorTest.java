import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddTwoPositiveNumbers() {
        //ARRANGE
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        // ACT
        int somme = calculator.add(a,b);

        // ASSERT
        assertEquals(5, somme);
    }

    @Test
    public void testSubTwoPositiveNumbers() {
        //ARRANGE
        int a = 5;
        int b = 2;
        Calculator calculator = new Calculator();

        // ACT
        int somme = calculator.sub(a,b);

        // ASSERT
        assertEquals(3, somme);

    }

}
