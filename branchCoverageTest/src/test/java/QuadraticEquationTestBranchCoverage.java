import org.example.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTestBranchCoverage {

    @Test
    public void solveShouldThrowAnExceptionIfAEquals0(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> QuadraticEquation.solve(0,3,1));
    }

    @Test
    public void solveShouldReturnNullIfDeltalowerThan0(){
        Assertions.assertEquals(null,QuadraticEquation.solve(3,4,2));
    }

    @Test
    public void solveShouldReturnAnArrayOfLength1IfDeltaEquals0(){
        Assertions.assertEquals(1,QuadraticEquation.solve(2,4,2).length);
    }
    @Test
    public void solveShouldReturnAnArrayOfLength2IfDeltaEquals0(){
        Assertions.assertEquals(2,QuadraticEquation.solve(2,5,2).length);

    }

}
