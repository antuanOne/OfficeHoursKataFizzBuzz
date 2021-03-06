import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Usuario on 31/05/2016.
 */
public class FizzBuzzTest  {

    @Test
    public void testWhenValueIsThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.getFizzBuzzResult(3));
    }

    @Test
    public void testWhenValueIsFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.getFizzBuzzResult(5));
    }

    @Test
    public void testWhenValueIsMultipleOfTreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz",fizzBuzz.getFizzBuzzResult(15));

    }

    @Test
    public void testWhenValueIsNotAMultipleOfTreeOrFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("98",fizzBuzz.getFizzBuzzResult(98));

    }

}