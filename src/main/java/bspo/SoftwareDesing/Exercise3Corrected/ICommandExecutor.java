package bspo.SoftwareDesing.Exercise3Corrected;

import bspo.SoftwareDesing.Exercise3Corrected.Commands.ICommand;

import java.util.HashMap;

public interface ICommandExecutor<T> {
    void execute(String command, IPaginator paginator);
    void add(String token, ICommand cmd);
    void setInvalidCommand(ICommand cmd);
    HashMap<String, ICommand> getCommands();
}
