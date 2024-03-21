package bspo.SoftwareDesing.Exercise3Corrected;

import bspo.SoftwareDesing.Exercise3Corrected.Commands.ICommand;

public class CommandInvalid<T> implements ICommand<T> {
    @Override
    public void execute(IPaginator paginator) {
        paginator.exit();
        System.out.println("Comando invalido");
    }
}
