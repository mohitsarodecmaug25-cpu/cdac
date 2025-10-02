class VehicleBase {
    public void displaySpeed() { System.out.println("Vehicle speed unknown"); }
}

class Car2 extends VehicleBase {
    @Override public void displaySpeed() { System.out.println("Car speed 120 km/h"); }
}

class Bike2 extends VehicleBase {
    @Override public void displaySpeed() { System.out.println("Bike speed 80 km/h"); }
}

public class Assignment17_VehicleSpeedDisplay {
    public static void main(String[] args) {
        VehicleBase car = new Car2();
        VehicleBase bike = new Bike2();
        car.displaySpeed();
        bike.displaySpeed();
    }
}
