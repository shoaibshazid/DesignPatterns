package behavioural.strategypattern.with;

import behavioural.strategypattern.with.strategy.SpeedDrive;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SpeedDrive());
    }

}
