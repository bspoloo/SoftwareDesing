package bspo.SoftwareDesing.Observer.ObserverDecorator;

import java.util.List;

public interface IObserver {
    void update(String context, List<Integer> data);
}
