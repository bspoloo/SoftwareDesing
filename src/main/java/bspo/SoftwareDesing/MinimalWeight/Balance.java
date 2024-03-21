package bspo.SoftwareDesing.MinimalWeight;

public class Balance {
    String weights;
    int number;

    public Balance(int number, String weights) {
        this.weights = weights;
        this.number = number;
    }

    public int getMinimalWeight() {
        int[] weightsArray = StringToArray(weights);
        int minimalWeight = Integer.MAX_VALUE;

        for (int i = 0; i < number - 1; i++) {
            if (Math.abs(weightsArray[i] - weightsArray[i + 1]) < minimalWeight) {
                minimalWeight = Math.abs(weightsArray[i] - weightsArray[i + 1]);
            }
        }
        return minimalWeight;
    }

    public int[] StringToArray(String weights) {
        int[] weightsArray = new int[number];
        String[] weightString = weights.split(" ");

        for (int i = 0; i < number; i++) {
            weightsArray[i] = Integer.parseInt(weightString[i]);
        }
        return weightsArray;
    }
}
