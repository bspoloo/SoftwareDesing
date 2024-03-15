package bspo.SoftwareDesing.Observer.ObserverDecorator;

public class ConditionMultiple implements ICondition {
    private int number;

    public ConditionMultiple(int number) {
        this.number = number;
    }

    @Override
    public boolean evaluate(int x) {
        return x % number == 0;
    }
}
