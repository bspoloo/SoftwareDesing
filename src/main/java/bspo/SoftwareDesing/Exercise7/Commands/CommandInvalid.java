package bspo.SoftwareDesing.Exercise7.Commands;

import bspo.SoftwareDesing.Exercise7.ISorter;

public class CommandInvalid<T> implements ICommand<T> {
    @Override
    public void execute(ISorter sorter) {
        System.out.println("Comando invalido");
    }
}
