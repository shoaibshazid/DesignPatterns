package behavioural.strategypattern.with.strategy;

public class NormalDrive implements DriveStrategy {
    public void drive(){
        System.out.println("NormalDrive is driving");
    }
}
