package bspo.SoftwareDesing.Observer.ObsercerBad;

public class ObserverAdder {
    private Numbers numbers;

    public ObserverAdder(Numbers numbers)
    {
        this.numbers = numbers;
    }
    public void update()
    {
        int sum = 0;
        for (int n : numbers.GeTNumberList())
        {
            sum += n;
        }

        System.out.println("Sum is:  "+sum);
    }
}
