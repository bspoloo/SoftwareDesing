package bspo.SoftwareDesing.Observer.ObserverDecorator;

import java.util.List;

public class ObserverPair implements IObserver {
    private Numbers numbers;
    ICondition condition;
    public ObserverPair(Numbers numbers){
        this.numbers = numbers;
        this.condition = new ConditionMultiple(2);
    }
    @Override
    public void update(String context, List<Integer> data) {
        int sum = 0;

        for (int n : data)
        {
            if(condition.evaluate(n))
            {
                sum += n;
            }
            System.out.println(context + sum);
        }

    }
}
