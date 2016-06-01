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

}