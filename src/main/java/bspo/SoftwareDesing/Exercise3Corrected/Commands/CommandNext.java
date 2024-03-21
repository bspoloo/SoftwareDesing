package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;
import bspo.SoftwareDesing.Exercise3Corrected.Page;

public class CommandNext<T> implements ICommand<T>{
    @Override
    public void execute(IPaginator paginator) {
        Page pageNext = paginator.next();
        pageNext.print();
        pageNext.menu();
    }
}
