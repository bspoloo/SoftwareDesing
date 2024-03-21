package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;
import bspo.SoftwareDesing.Exercise3Corrected.Page;

public class CommandLast<T> implements ICommand<T>{
    @Override
    public void execute(IPaginator paginator) {
        Page pageLast = paginator.last();
        pageLast.print();
        pageLast.menu();
    }
}
