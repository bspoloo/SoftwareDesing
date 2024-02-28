package bspo.SoftwareDesing.Exercise5;

public class NumberGenerate {
    public int[] generateNumbers(int numbers) {
        int[] randomNumbers = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            randomNumbers[i] = getNumbers();
        }
        return randomNumbers;
    }
    public int getNumbers() {
        int min = 0;
        int max = 100;
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}

