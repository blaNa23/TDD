import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    public void testAdunare() {

        assertEquals(5, calculator.adunare(2, 3));
        assertEquals(10, calculator.adunare(2, 5, 3));
        assertEquals(0, calculator.adunare(0, 0, 0, 0, 0));

    }

    @Test
    public void testInmultire() {

        assertEquals(42, calculator.inmultire(7, 6));
        assertEquals(162, calculator.inmultire(9, 6, 3));
        assertEquals(0, calculator.inmultire(9, 6, 3, 0));
    }

    @Test
    public void testScadere() {
        assertEquals(10, calculator.scadere(15, 5));
        assertEquals(1, calculator.scadere(100, 50, 35, 13, 1));
        assertEquals(0, calculator.scadere(0, 0, 0));
    }

    @Test
    public void testImpartire() {
        //assertEquals este deprecated. Aparent trebuie folosit delta(o pierdere de precizie)
        assertEquals(5, calculator.impartire(25, 5),0.0001);
        assertEquals(3.3333333333, calculator.impartire(10, 3),0.0001);
        assertEquals(2.5, calculator.impartire(10, 4),0.0001);
    }

}
