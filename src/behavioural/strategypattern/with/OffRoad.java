package behavioural.strategypattern.with;

import behavioural.strategypattern.with.strategy.NormalDrive;

public class OffRoad extends Vehicle{
    public OffRoad() {
        super(new NormalDrive());
    }
}
