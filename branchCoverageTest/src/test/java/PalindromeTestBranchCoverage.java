
import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PalindromeTestBranchCoverage {


    @Test
    public void isPalindromeShouldThrowNullPointerExceptionIfStringIsNull(){
        Assertions.assertThrows(NullPointerException.class, ()->Palindrome.isPalindrome(null));
    }

    @Test
    public void isPalindromeShouldReturnFalseIfTheWordIsNotPalindrome(){
        Assertions.assertFalse(Palindrome.isPalindrome("toufik"));
    }

    @Test
    public void isPalindromeShouldReturnTrueIfTheWordIsPalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("radar"));
    }

}
