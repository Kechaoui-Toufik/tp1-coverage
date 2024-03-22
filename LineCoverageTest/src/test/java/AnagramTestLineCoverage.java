import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Anagram;

public class AnagramTestLineCoverage {

    @Test
    public void isAnagramShouldThrowAnExceptionIfAtLeastOneOfTheStringsIsNull(){
         Assertions.assertThrows(NullPointerException.class, ()->Anagram.isAnagram(null,"toufik"));
    }

    @Test
    public void isAnagramShouldReturnFalseIfTheTwoStringsAreOfDifferentSizes(){
         Assertions.assertFalse(Anagram.isAnagram("toufik","toufik1"));
    }

    @Test
    public void isAnagramShouldReturnTrueIfTheTwoStringsAreAnagram(){
         Assertions.assertTrue(Anagram.isAnagram("toufik","kifuot"));
    }

    @Test
    public void isAnagramShouldReturnFalseIfTheTwoStringsAreNotAnagram(){
        Assertions.assertFalse(Anagram.isAnagram("toufik","kifupt"));
    }

}
