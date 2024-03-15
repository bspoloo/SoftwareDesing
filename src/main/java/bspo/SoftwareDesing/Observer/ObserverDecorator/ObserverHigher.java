package bspo.SoftwareDesing.Observer.ObserverDecorator;

import java.util.List;

public class ObserverHigher implements IObserver {
    private Numbers numbers;

    public ObserverHigher(Numbers numbers)
    {
        this.numbers = numbers;
    }

    @Override
    public void update(String context, List<Integer> data) {
        if(data.isEmpty()) {
            System.out.println("don't exist high number in this list.......");
            return;
        }

        int higher = Integer.MIN_VALUE;
        for (int n : data)
        {
            if(n>higher){
                higher = n;
            }

        }

        System.out.println(context + higher);
    }
}
