package bspo.SoftwareDesing.Observer.ObsercerGood;

public class ObserverPair implements IObserver{
    private Numbers numbers;
    ICondition condition;
    public ObserverPair(Numbers numbers){
        this.numbers = numbers;
        this.condition = new ConditionMultiple(2);
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
            System.out.println("The Sum is of Pair Numbers is:  "+ sum);
        }

    }
}
