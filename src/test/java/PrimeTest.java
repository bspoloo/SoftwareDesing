import bspo.SoftwareDesing.PrimeNumber.Prime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PrimeTest {
    @ParameterizedTest
    @ValueSource (ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29})
    @DisplayName("Probando numeros primos xd")
    public void testIsPrime(int number) {
        Prime prime = new Prime();
        Assertions.assertTrue(prime.isPrime(number));
    }

    @Test
    public void testIsPrime() {
        Prime prime = new Prime();
        Assertions.assertTrue(prime.isPrime(5));
    }
    @Test
    public void testIsNotPrime() {
        Prime prime = new Prime();
        Assertions.assertFalse(prime.isPrime(8));
    }
    @Test
    public void testNumberZero() {
        Prime prime = new Prime();
        Assertions.assertFalse(prime.isPrime(0));
    }
    @Test
    public void testNegativeNumber() {
        Prime prime = new Prime();
        Assertions.assertFalse(prime.isPrime(-5));
    }
    @Test
    public void testNumberOne() {
        Prime prime = new Prime();
        Assertions.assertFalse(prime.isPrime(1));
    }

}
