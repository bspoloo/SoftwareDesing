package bspo.SoftwareDesing.Exercise7.Commands;

import bspo.SoftwareDesing.Exercise7.ISorter;

public class CommandExit<T> implements ICommand<T> {
    @Override
    public void execute(ISorter sorter) {
        System.out.println("Exiting");
        System.exit(0);
    }
}
