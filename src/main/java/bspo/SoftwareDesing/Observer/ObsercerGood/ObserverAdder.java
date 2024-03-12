package bspo.SoftwareDesing.Observer.ObsercerGood;

public class ObserverAdder implements IObserver{
    private Numbers numbers;

    public ObserverAdder(Numbers numbers)
    {
        this.numbers = numbers;
    }
    @Override
    public void update() {
        int sum = 0;
        for (int n : numbers.GeTNumberList())
        {
            sum += n;
        }

        System.out.println("Sum is:  "+ sum);
    }
}
