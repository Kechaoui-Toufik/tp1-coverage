import org.example.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.BinarySearch;
public class BinarySearchTestBranchCoverage {
    private final int N = 10;
    private int[] array=  new int[N];

    @BeforeEach
    public void setup(){
        for(int i = 0; i < N;i++){
            array[i] = i+1;
        }
    }
    @Test
    public void binarySearchShouldThrowAnExceptionIfArrayIsNULL(){
        Assertions.assertThrows(NullPointerException.class, ()->BinarySearch.binarySearch(null,1));
    }

    @Test
    public void binarySearchShouldReturnTheElementIfItExistsInTheArray(){

        Assertions.assertEquals(5,BinarySearch.binarySearch(array,6));
    }
    @Test
    public void binarySearchShouldReturnMinesOneIfTheElementDoesntExistInTheArray(){

        Assertions.assertEquals(-1,BinarySearch.binarySearch(array,11));
    }
}
