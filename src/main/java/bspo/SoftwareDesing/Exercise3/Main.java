package bspo.SoftwareDesing.Exercise3;

import bspo.SoftwareDesing.Exercise3Corrected.Commands.CommandExecutorFactory;
import bspo.SoftwareDesing.Exercise3Corrected.Commands.ICommandExecutor;
import bspo.SoftwareDesing.Exercise3Corrected.Commands.IPaginator;
import bspo.SoftwareDesing.Exercise3Corrected.Commands.Paginator;

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
        ICommandExecutor<String> executor= CommandExecutorFactory.<String>get();
        IPaginator<String> paginator =new Paginator<>();

        while(true)
        {
            String cmd = s.nextLine();
            executor.execute(cmd, paginator);
        }
    }
}
