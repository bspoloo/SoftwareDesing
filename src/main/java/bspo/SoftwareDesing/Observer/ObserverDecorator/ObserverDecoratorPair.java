package bspo.SoftwareDesing.Observer.ObserverDecorator;

import java.util.ArrayList;
import java.util.List;

public class ObserverDecoratorPair implements IObserver{
    IObserver observerDecorated;
    String context;
    public ObserverDecoratorPair(String context, IObserver obs){
        this.observerDecorated = obs;
        this.context = context;
    }
    @Override
    public void update(String context, List<Integer> data) {
        context = this.context;
        List<Integer> odds = new ArrayList<>();

        for(Integer n : data) {
            if (n % 2 == 1) {
                odds.add(n);
            }
        }

        observerDecorated.update(context, odds);
    }
}
