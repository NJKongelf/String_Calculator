
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    @Test
    public void addTwoNumbersAndReturnTheSum(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(3,calculator.Add("2,1"));

    }
    @Test
    public void addfourNumbersAndReturnTheSum(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(10,calculator.Add("6,2,1,1"));

    }
    @Test
    public void addfourNumberswithdiffrentSeparatorAndReturnTheSum(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(10,calculator.Add("6\n2,1\n1"));
        assertEquals(10,calculator.Add("6;2,1\n1"));

    }
    @Test
    void throwExceptionOnNegativeNumber(){
        StringCalculator calculator = new StringCalculator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                ()-> calculator.Add("-1,2,-3")
        );
        assertEquals("negatives not allowed: [-1, -3]",exception.getMessage());

    }
    @Test
    void addNullReturnsZero(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(0,calculator.Add(null));
    }
    @Test
    public void addthreeNumberswithdiffrentSeparatorAndReturnTheSum(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(3,calculator.Add("1*1%1"));
    }
    @Test
    public void addthreeNumberswithdiffrentSeparatorLengthOnSeperetorAndReturnTheSum(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(5,calculator.Add("2;;;1*******1%%%%%1"));
    }
}
