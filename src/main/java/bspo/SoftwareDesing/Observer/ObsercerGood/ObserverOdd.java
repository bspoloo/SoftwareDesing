package bspo.SoftwareDesing.Observer.ObsercerGood;

public class ObserverOdd implements IObserver{
    private Numbers numbers;
    ICondition condition;
    public ObserverOdd(Numbers numbers){
        this.numbers = numbers;
        this.condition = new ConditionDenier(new ConditionMultiple(2));

    }
    @Override
    public void update() {
        int sum = 0;
        for (int n : numbers.GeTNumberList())
        {
            if(condition.evaluate(n))
            {
                sum += n;
            }
            System.out.println("The Sum is of Odd Numbers is:  "+ sum);
        }
    }
}
