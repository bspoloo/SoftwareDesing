package bspo.SoftwareDesing.Exercise3Corrected.Commands;

public interface ICommand<T> {
    void execute(IPaginator<T> paginator);
}
