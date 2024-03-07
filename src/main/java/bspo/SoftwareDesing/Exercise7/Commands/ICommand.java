package bspo.SoftwareDesing.Exercise7.Commands;

import bspo.SoftwareDesing.Exercise7.ISorter;

public interface ICommand<T> {
    void execute(ISorter sorter);
}
