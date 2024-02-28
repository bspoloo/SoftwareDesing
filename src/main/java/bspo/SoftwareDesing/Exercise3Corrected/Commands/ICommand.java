package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPagination;

public interface ICommand<T> {
    void execute(IPagination<T> pagination);
}
