import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CalcEngineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalcEngineTest {
    

    public void testSingleDigit(){
        CalcEngine engine = new CalcEngine();
        int display = engine.getDisplayValue();
        engine.numberPressed(7);
        assertEquals(7, engine.getDisplayValue()); 
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void testMultipleDigit(){
        CalcEngine engine = new CalcEngine();
        engine.numberPressed(1);
        engine.numberPressed(2);
        engine.numberPressed(3);
        assertEquals(123, engine.getDisplayValue());
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void testAddition(){
        CalcEngine engine = new CalcEngine();
        engine.numberPressed(5);
        engine.plus();
        engine.numberPressed(3);
        engine.equals();
        assertEquals(8, engine.getDisplayValue()); 
    }
    public void testSubtration(){
        CalcEngine engine = new CalcEngine();
        engine.numberPressed(10);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();
        assertEquals(6, engine.getDisplayValue());
    }

    @Test
    public void d()
    {
        CalcEngine calcEngi1 = new CalcEngine();
    }
}



