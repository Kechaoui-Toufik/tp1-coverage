import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.RomanNumeral;
public class RomanNumeralTestLineCoverage {

    @Test
    public void toRomanShouldThrowAnExceptionIfNisLowerThan1OrGreaterThan3999(){
         Assertions.assertThrows(IllegalArgumentException.class, ()->RomanNumeral.toRoman(0));
    }

    @Test
    public void toRomanShouldReturnTheCorrectRomanNumberIfNIsInTheInterval(){
         Assertions.assertEquals("VIII",RomanNumeral.toRoman(8));
    }


}
