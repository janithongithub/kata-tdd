import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringCalculatorTest {

    //positive
    @Test
    public final void twoNumbers(){
        assertEquals(5+3,StringCalculator.add("5,3"));
        
    }

    @Test
    public final void oneNumber(){
        assertEquals(5, StringCalculator.add("5"));
        
    }


    @Test
    public final void noNumber(){
        assertEquals(0, StringCalculator.add(""));
    }

   
    @Test
    public final void unkAmountOfNumbers(){
        assertEquals(1+2+3, StringCalculator.add("1,2,3"));
    }

    @Test
    public final void newLineDelimiterAnd3Numbers( ){
        assertEquals(1+2+3, StringCalculator.add("1\n2,3"));
    }

    @Test
    public final void changeInDelimiters(){
        assertEquals(1+2, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public final void oneNumberGreaterThan1000(){
        assertEquals(0, StringCalculator.add("1001"));
    }

    @Test
    public final void manyNumbersGreaterThan1000(){
        assertEquals(0, StringCalculator.add("1001,1030,2008"));
    }

    @Test
    public final void mixedWithGreaterThan1000(){
        assertEquals(1+2+3, StringCalculator.add("1,2,1001,3,2001"));
    }


    @Test(expected=RuntimeException.class)
    public final void nonNumberUsed(){
        StringCalculator.add("1,X");
    }

    @Test(expected=RuntimeException.class)
    public final void NegativeNumberUsed(){
        StringCalculator.add("3,-2");
    }

    
}