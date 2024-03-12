package bspo.SoftwareDesing.Observer.ObsercerGood;

public class ObserverHigher implements IObserver{
    private Numbers numbers;

    public ObserverHigher(Numbers numbers)
    {
        this.numbers = numbers;
    }

    @Override
    public void update() {
        int higher = Integer.MIN_VALUE;
        for (int n : numbers.GeTNumberList())
        {
            if(n>higher){
                higher = n;
            }

        }

        System.out.println("the largest number is "+ higher);
    }
}
