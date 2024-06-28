package behavioural.strategypattern.without;

public class Main {
    public static void main(String[] args) {

        OffRoadVehicle offRoad = new OffRoadVehicle();
        offRoad.drive();

        SpeedVehicle speed = new SpeedVehicle();
        speed.drive();
    }
}