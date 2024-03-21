package bspo.SoftwareDesing.Exercise3Corrected.Commands;

import bspo.SoftwareDesing.Exercise3Corrected.IPaginator;

public interface ICommand<T> {
    void execute(IPaginator paginator);
}
