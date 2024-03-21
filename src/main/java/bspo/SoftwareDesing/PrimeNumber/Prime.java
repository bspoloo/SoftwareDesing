package bspo.SoftwareDesing.PrimeNumber;

public class Prime {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void afterNumber(int i, int number){
        if (i == number){
            return;
        }
        i =i+2;
        if (number % i == 0){
            System.out.println("El numero no es primo");
        }
    }
}
