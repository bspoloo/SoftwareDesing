package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import java.util.HashMap;

public interface ICommandExecutor <T>{
    void execute(String command, IPaginator<T> paginator);
    void add(String token, ICommand cmd);
    void setInvalidCommand(ICommand cmd);
    HashMap<String, ICommand> getCommands();
}
