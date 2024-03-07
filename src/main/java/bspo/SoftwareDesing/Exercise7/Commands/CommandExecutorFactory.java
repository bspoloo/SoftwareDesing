package bspo.SoftwareDesing.Exercise7.Commands;

public class CommandExecutorFactory {
    public static ICommandExecutor<String> get()
    {
        ICommandExecutor executor = new CommandExecutor<String>();
        executor.setInvalidCommand(new CommandInvalid<String>());
        executor.add("salir", new CommandExit<String>());

        executor.add("Nombres", new CommandSortName());
        executor.add("Edades", new CommandSortAge());
        executor.add("Grado", new CommandSortGrade());

        return executor;
    }
}
