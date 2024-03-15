package bspo.SoftwareDesing.ReadSquares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Software Developers\\SoftwareDesing\\src\\main\\java\\bspo\\SoftwareDesing\\ReadSquares\\example - Ivan2.txt";
        Reader reader = new Reader(filePath);
        reader.readDocument();
    }
}
