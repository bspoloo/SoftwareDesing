package bspo.SoftwareDesing.ReadSquares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDocument {
    String path;
    FileReader fileReader;
    BufferedReader bufferedReader;
    int rows;
    int columns;
    char[][] arrays;

    public ReaderDocument(String path) {
        this.path = path;
        this.rows = 20;
        this.columns = 50;
        this.arrays = new char[rows][columns];
    }

    public void readDocument() {
        try {
            fileReader = new FileReader(this.path);
            bufferedReader = new BufferedReader(fileReader);

            char[][] arrays = new char[rows][columns];

            String line;
            int currentRow = 0;

            while ((line = bufferedReader.readLine()) != null && currentRow < rows) {
                line = line.substring(0, Math.min(line.length(), columns));

                char[] characters = line.toCharArray();
                arrays = addToArrays(characters, currentRow);
                currentRow++;
            }

            bufferedReader.close();
            printArray();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public char[][] addToArrays(char[] characters, int currentRow) {

        for (int i = 0; i < characters.length; i++) {
            arrays[currentRow][i] = characters[i];
        }
        return arrays;
    }

    public void printArray() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }
}
