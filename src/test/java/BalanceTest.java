import bspo.SoftwareDesing.MinimalWeight.Balance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class BalanceTest {
    @Test
    public void testMinimalWeight() {
        int number = 5;
        String weights = "100 90 25 20 11";
        //90 11 20
        //100 25
        Balance balance = new Balance(number, weights);
        Assertions.assertEquals(5, balance.getMinimalWeight());
    }
}
