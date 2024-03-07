package bspo.SoftwareDesing.Exercise7.Commands;

import bspo.SoftwareDesing.Exercise7.ISorter;

import java.util.HashMap;

public interface ICommandExecutor <T>{
    void execute(String command, ISorter sorter);
    void add(String token, ICommand cmd);
    void setInvalidCommand(ICommand cmd);
    HashMap<String, ICommand> getCommands();
}
