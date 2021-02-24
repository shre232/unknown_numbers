import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class testCalculate {
    @Test
    void emptyStringReturnZero() {
        Assertions.assertEquals(stringCalculator.Add(""), 0);
    }

    @Test
    void number_for_one_number(){
        Assertions.assertEquals(stringCalculator.Add("1") ,1);
    }
    @Test
    void sum_of_two_numbers(){
        Assertions.assertEquals(stringCalculator.Add( "1,2"),3);
    }
}