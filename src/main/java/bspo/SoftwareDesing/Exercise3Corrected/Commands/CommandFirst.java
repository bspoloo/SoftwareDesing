package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;
import bspo.SoftwareDesing.Exercise3Corrected.Page;

public class CommandFirst<T> implements ICommand<T>{
    @Override
    public void execute(IPaginator paginator) {
        System.out.println("First page");
        Page pageFirst = paginator.first();
        pageFirst.print();
        pageFirst.menu();
    }
}
