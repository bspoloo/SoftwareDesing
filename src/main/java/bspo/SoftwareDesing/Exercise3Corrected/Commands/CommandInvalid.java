package bspo.SoftwareDesing.Exercise3Corrected.Commands;

public class CommandInvalid<T> implements ICommand<T>{
    @Override
    public void execute(IPaginator<T> paginator) {
        System.out.println("Comando invalido");
    }
}
