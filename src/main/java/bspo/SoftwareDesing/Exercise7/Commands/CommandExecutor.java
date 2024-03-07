package bspo.SoftwareDesing.Exercise7.Commands;

import bspo.SoftwareDesing.Exercise7.ISorter;

import java.util.HashMap;

public class CommandExecutor<T> implements ICommandExecutor<T> {
    private HashMap<String, ICommand> commands = new HashMap<String, ICommand>();
    private ICommand invalidCommand;

    @Override
    public void add(String token, ICommand cmd) {
        commands.put(token, cmd);
    }

    @Override
    public void execute(String command, ISorter sorter) {
        if(commands.containsKey(command))
        {
            commands.get(command).execute(sorter);
        }
        else
        {
            invalidCommand.execute(sorter);
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
