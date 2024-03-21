package bspo.SoftwareDesing.Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * create a manager using the interface IRunner
         */
        IRunner managerRunner = new BookRun();

        /**
         * Run the manager
         */
        managerRunner.run();

        Scanner s = new Scanner(System.in);

    }
}
