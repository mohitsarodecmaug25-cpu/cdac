interface LandVehicle { void driveOnLand(); }
interface WaterVehicle { void driveOnWater(); }

class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    private String name;
    public AmphibiousVehicle(String name) { this.name = name; }
    public void driveOnLand() { System.out.println(name + " -> Driving on Land"); }
    public void driveOnWater() { System.out.println(name + " -> Driving on Water"); }
}

public class Assignment22_AmphibiousVehicle {
    public static void main(String[] args) {
        AmphibiousVehicle v = new AmphibiousVehicle("HydroCar");
        v.driveOnLand();
        v.driveOnWater();
    }
}
