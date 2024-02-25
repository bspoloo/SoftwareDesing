package bspo.SoftwareDesing.Exercise3;

public interface IPagination<T> {
    T first();
    T last();
    T next();
    T prev();
    T goTo(int id);
    void exit();
}
