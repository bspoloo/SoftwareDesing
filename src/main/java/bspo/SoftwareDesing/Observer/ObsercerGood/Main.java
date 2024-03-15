package bspo.SoftwareDesing.Observer.ObsercerGood;

import bspo.SoftwareDesing.Observer.ObsercerGood.Numbers;
import bspo.SoftwareDesing.Observer.ObsercerGood.ObserverAdder;
import bspo.SoftwareDesing.Observer.ObsercerGood.ObserverHigher;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        ObserverAdder adder = new ObserverAdder(numbers);
        numbers.attach(adder);

        ObserverHigher higher =new ObserverHigher(numbers);
        numbers.attach(higher);

        // for the pair numbers
        ObserverPair pair = new ObserverPair(numbers);
        numbers.attach(pair);

        ObserverOdd odd = new ObserverOdd(numbers);
        numbers.attach(odd);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

    }
}
