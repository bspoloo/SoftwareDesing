package bspo.SoftwareDesing.Observer.ObsercerBad;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    List<Integer> numbers;
    ObserverAdder adder;
    ObserverHigher higher;
    public Numbers()
    {
        numbers = new ArrayList<>();
    }

    public void setAdder(ObserverAdder adder)
    {this.adder=adder;}

    public void SetMayor(ObserverHigher higher)
    {this.higher=higher;}

    public void add(int n)
    {
        if (!numbers.contains(n)){
            numbers.add(n);
            notifyObs();
        }
    }

    private void notifyObs()
    {
        adder.update();
        higher.update();
    }

    public List<Integer> GeTNumberList(){
        return numbers;
    }
}
