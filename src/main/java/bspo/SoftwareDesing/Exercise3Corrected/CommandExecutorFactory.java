package bspo.SoftwareDesing.Exercise3Corrected;

import bspo.SoftwareDesing.Exercise3Corrected.Commands.*;

public class CommandExecutorFactory {
    public static ICommandExecutor<String> get()
    {
        ICommandExecutor executor = new CommandExecutor<String>();
        executor.setInvalidCommand(new CommandInvalid<String>());
        executor.add("add", new CommandAdd<String>());
        executor.add("first", new CommandFirst<String>());
        executor.add("last", new CommandLast<String>());
        executor.add("next", new CommandNext<String>());
        executor.add("prev", new CommandPrev<String>());
        executor.add("go", new CommandGoTo<String>());
        executor.add("exit", new CommandExit<String>());

        return executor;
    }
}
