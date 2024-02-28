package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import java.util.HashMap;

public class CommandExecutor<T> implements ICommandExecutor<T> {
    private HashMap<String, ICommand> commands = new HashMap<String, ICommand>();
    private ICommand invalidCommand;

    @Override
    public void add(String token, ICommand cmd) {
        commands.put(token, cmd);
    }

    @Override
    public void execute(String command, IPaginator<T> paginator) {
        if(commands.containsKey(command))
        {
            commands.get(command).execute(paginator);
        }
        else
        {
            invalidCommand.execute(paginator);
        }
    }

    @Override
    public void setInvalidCommand(ICommand cmd) {
        invalidCommand = cmd;
    }

    @Override
    public HashMap<String, ICommand> getCommands() {
        return commands;
    }
}
