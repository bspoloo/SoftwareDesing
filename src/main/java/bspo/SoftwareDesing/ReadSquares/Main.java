package bspo.SoftwareDesing.ReadSquares;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "F:\\acceso\\Formacion en Desarrollo de Software\\Temas\\Modulo 4\\Software Desing\\src\\main\\java\\bspo\\SoftwareDesing\\ReadSquares\\example - Ivan2.txt";
        ReaderDocument readerDocument = new ReaderDocument(filePath);

        char[][] screen = readerDocument.readDocument();

        List<Frame> frames = new ArrayList<>();
        Reader reader = new Reader(screen);

        reader.getFrames(frames);

        System.out.println(frames.size());

        for (Frame frame : frames) {
            System.out.println(frame.x + " " + frame.y + " " + frame.side);
        }
    }
}
