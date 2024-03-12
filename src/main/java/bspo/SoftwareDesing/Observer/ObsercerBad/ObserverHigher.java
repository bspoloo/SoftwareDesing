package bspo.SoftwareDesing.Observer.ObsercerBad;

public class ObserverHigher {
    private Numbers numbers;

    public ObserverHigher(Numbers numbers)
    {
        this.numbers = numbers;
    }
    public void update()
    {
        int higher = Integer.MIN_VALUE;
        for (int n : numbers.GeTNumberList())
        {
            if(n>higher){
                higher = n;
            }

        }

        System.out.println("El mayor es "+ higher);
    }
}
