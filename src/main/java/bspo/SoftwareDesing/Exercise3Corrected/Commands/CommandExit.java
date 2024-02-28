package bspo.SoftwareDesing.Exercise3Corrected.Commands;

public class CommandExit<T> implements ICommand<T>{
    @Override
    public void execute(IPaginator<T> paginator) {
        System.out.println("Exiting");
        System.exit(0);
    }
}
