import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.RomanNumeral;

public class RomanNumeralTestBranchCoverage {

    @Test
    public void toRoman1ShouldThrowAnExceptionIfNisLowerThan1OrGreaterThan3999(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->RomanNumeral.toRoman(0));
    }
    @Test
    public void toRoman2ShouldThrowAnExceptionIfNisLowerThan1OrGreaterThan3999(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->RomanNumeral.toRoman(4000));
    }

    @Test
    public void toRomanShouldReturnTheCorrectRomanNumberIfNIsInTheInterval(){
        Assertions.assertEquals("VIII",RomanNumeral.toRoman(8));
    }


}
