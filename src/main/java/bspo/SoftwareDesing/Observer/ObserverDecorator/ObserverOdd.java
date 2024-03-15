package bspo.SoftwareDesing.Observer.ObserverDecorator;

import java.util.List;

public class ObserverOdd implements IObserver {
    private Numbers numbers;
    ICondition condition;
    public ObserverOdd(Numbers numbers){
        this.numbers = numbers;
        this.condition = new ConditionDenier(new ConditionMultiple(2));

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
