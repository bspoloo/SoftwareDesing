package bspo.SoftwareDesing.Exercise3Corrected;

import bspo.SoftwareDesing.Exercise3Corrected.Commands.*;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ICommandExecutor<String> commandExecutor = CommandExecutorFactory.get();
        HashMap<String, ICommand> commands = commandExecutor.getCommands();

        printMenu();
        System.out.println("Enter the command: ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        IPaginator paginator = new Paginator();

        while (!Objects.equals(command, "exit")) {

            ICommand action = commands.get(command);
            action.execute(paginator);
            printMenu();
            System.out.println("Enter the command: ");
            command = scanner.nextLine();
        }
    }
    public static void printMenu() {
        System.out.println("1. add");
        System.out.println("2. first");
        System.out.println("3. next");
        System.out.println("4. prev");
        System.out.println("5. last");
        System.out.println("6. goTo");
        System.out.println("6. Exit");
    }
}
