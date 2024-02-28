package bspo.SoftwareDesing.Exercise3Corrected.Commands;

public class CommandExecutorFactory {
    public static ICommandExecutor<String> get()
    {
        ICommandExecutor executor = new CommandExecutor<String>();
        executor.setInvalidCommand(new CommandInvalid<String>());
        executor.add("salir", new CommandExit<String>());

        executor.add("add", new CommandAdd<String>());

        //executor.add("prev", new ComandoPrev<String>());
        //executor.add("help", new ComandoAyuda(executor));

        return executor;
    }
}
