package bspo.SoftwareDesing.Exercise3Corrected;

import bspo.SoftwareDesing.Exercise3Corrected.Commands.ICommand;

import java.util.HashMap;

public class CommandExecutor<T> implements ICommandExecutor<T> {
    private HashMap<String, ICommand> commands = new HashMap<String, ICommand>();
    public ICommand invalidCommand;

    public CommandExecutor() {
        this.invalidCommand = new CommandInvalid();
    }
    @Override
    public void add(String token, ICommand cmd) {
        commands.put(token, cmd);
    }

    @Override
    public void execute(String command, IPaginator paginator) {


        if(commands.containsKey(command))
        {
            System.out.println("Comando valido"+ command);
            commands.get(command).execute(paginator);

        }
        else
        {
            System.out.println("Comando invalido");

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
