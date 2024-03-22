import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.FizzBuzz;
public class FizzBuzzTestBranchCoverage {

    @Test
    public void fizzBuzzShouldthrowAnExceptionIfNLowerOrEqualThan1(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->FizzBuzz.fizzBuzz(-1));
    }
    @Test
    public void fizzBuzzShouldReturFizzIfNcanBeDefidedBy3(){
        Assertions.assertEquals("Fizz",FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void fizzBuzzShouldReturBuzzIfNcanBeDefidedBy5(){
        Assertions.assertEquals("Buzz",FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void fizzBuzzShouldReturFizzBuzzIfNcanBeDefidedBy3And5(){
        Assertions.assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void fizzBuzzShouldReturnTheStringValueOfNelse(){
        Assertions.assertEquals("17",FizzBuzz.fizzBuzz(17));
    }
}
