/**
 * The main part of the calculator doing the calculations.
 * 
 * @author: (none yet)
 * @version 0.1 (incomplete)
 */
public class CalcEngine
{
    // Put instance variables here.
    private int currentValue;
    private int storedValue;
    private char operator;
    private boolean startNewOperand;

    /**
     * Create a CalcEngine.
     */
    public CalcEngine()
    {
        clear();
    }

    /**
     * @return The value that should currently be displayed
     * on the calculator display.
     */
    public int getDisplayValue()
    {
        return currentValue;
    }

    /**
     * A number button was pressed.
     * Either start a new operand, or incorporate this number as
     * the least significant digit of an existing one.
     * @param number The number pressed on the calculator.
     */
    public void numberPressed(int number) // When a number is pressed it will output the number selected
    {
        if(startNewOperand) {
            currentValue = number;
            startNewOperand = false;
        } else {
            currentValue = currentValue * 10 + number;
        
        }
     
    }

    /**
     * The 'plus' button was pressed. 
     */
    public void plus() // plus button pressed to add 
    {
        operator = '+';
        storedValue = currentValue;
        startNewOperand = true;
    }

    /**
     * The 'minus' button was pressed.
     */
    public void minus() // minus button pressed for subtraction
    {
        operator = '-';
        storedValue = currentValue;
        startNewOperand = true;
    }

    /**
     * The '=' button was pressed.
     */
    public void equals() // if the "=" button is pressed, it will give the answer to the problem
    {
        if (operator == '+') {
            currentValue = storedValue + currentValue;
        } else if (operator == '-') {
            currentValue = storedValue - currentValue;
        }
        operator = ' ';
        storedValue = 0;
        startNewOperand = true;
    }

    /**
     * The 'C' (clear) button was pressed.
     */
    public void clear() // will clear out any number from the calculator
    {
        operator = ' ';
        storedValue = 0;
        currentValue = 0;
        startNewOperand = true;
    }

    /**
     * @return The title of this calculation engine.
     */
    public String getTitle()
    {
        return "CalcEngine";
    }

    /**
     * @return The author of this engine. This string is displayed as it is,
     * so it should say something like "Written by H. Simpson".
     */
    public String getAuthor()
    {
        return "Victor Rivera Portillo";
    }

    /**
     * @return The version number of this engine. This string is displayed as 
     * it is, so it should say something like "Version 1.1".
     */
    public String getVersion()
    {
        return "1.0";
    }
}
