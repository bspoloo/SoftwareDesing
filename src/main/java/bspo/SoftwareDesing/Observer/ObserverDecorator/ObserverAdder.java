package bspo.SoftwareDesing.Observer.ObserverDecorator;

import java.util.List;

public class ObserverAdder implements IObserver {
    private final Numbers numbers;

    public ObserverAdder(Numbers numbers)
    {
        this.numbers = numbers;
    }
    @Override
    public void update(String context, List<Integer> data) {
        int sum = 0;
        for (int n : data)
        {
            sum += n;
        }

        System.out.println(context + sum);
    }
}
