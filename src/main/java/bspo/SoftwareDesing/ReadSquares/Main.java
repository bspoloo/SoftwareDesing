package bspo.SoftwareDesing.ReadSquares;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Software Developers\\SoftwareDesing\\src\\main\\java\\bspo\\SoftwareDesing\\ReadSquares\\example - Ivan2.txt";
        ReaderDocument readerDocument = new ReaderDocument(filePath);
        readerDocument.readDocument();
    }
}
