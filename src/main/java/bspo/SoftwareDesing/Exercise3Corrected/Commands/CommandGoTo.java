package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;
import bspo.SoftwareDesing.Exercise3Corrected.Page;

import java.util.Scanner;

public class CommandGoTo<T> implements ICommand<T>{

    @Override
    public void execute(IPaginator paginator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the page to go to: ");
        String pageString = scanner.nextLine();
        int page = Integer.parseInt(pageString);

        Page pageToGo = paginator.goTo(page);
        pageToGo.print();
        pageToGo.menu();
    }
}
