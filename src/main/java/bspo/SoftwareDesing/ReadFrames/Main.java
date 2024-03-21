package bspo.SoftwareDesing.ReadFrames;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Software Developers\\SoftwareDesing\\src\\main\\java\\bspo\\SoftwareDesing\\ReadFrames\\example - Ivan2.txt";
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
