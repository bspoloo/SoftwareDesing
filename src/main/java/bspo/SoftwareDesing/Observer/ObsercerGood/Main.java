package bspo.SoftwareDesing.Observer.ObsercerGood;

import bspo.SoftwareDesing.Observer.ObsercerGood.Numbers;
import bspo.SoftwareDesing.Observer.ObsercerGood.ObserverAdder;
import bspo.SoftwareDesing.Observer.ObsercerGood.ObserverHigher;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        ObserverAdder adder = new ObserverAdder(numbers);
        numbers.setAdder(adder);
        ObserverHigher mayor =new ObserverHigher(numbers);
        numbers.SetMayor(mayor);

        numbers.add(10);
        numbers.add(20);
        numbers.add(60);
        numbers.add(28);

    }
}
