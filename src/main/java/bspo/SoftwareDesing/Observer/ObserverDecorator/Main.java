package bspo.SoftwareDesing.Observer.ObserverDecorator;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        ObserverAdder adder = new ObserverAdder(numbers);
        numbers.attach(adder);

        ObserverHigher higher =new ObserverHigher(numbers);
        numbers.attach(higher);

        // for the pair numbers
//        ObserverPair pair = new ObserverPair(numbers);
//        numbers.attach(pair);
//
//        ObserverOdd odd = new ObserverOdd(numbers);
//        numbers.attach(odd);

        ObserverAdder adder1 = new ObserverAdder(numbers);
        ObserverDecoratorPair decoratorPair= new ObserverDecoratorPair("Sum of numbers pair is:  ",adder1);
        numbers.attach(decoratorPair);

        ObserverHigher higher1 = new ObserverHigher(numbers);
        ObserverDecoratorPair decoratorHigher= new ObserverDecoratorPair("Number pair higher is:",higher1);
        numbers.attach(decoratorHigher);

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
