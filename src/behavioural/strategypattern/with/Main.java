package behavioural.strategypattern.with;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        Vehicle vehicle2 = new OffRoad();
        vehicle2.drive();
    }
}
