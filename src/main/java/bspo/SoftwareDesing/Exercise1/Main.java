package bspo.SoftwareDesing.Exercise1;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Location> locations = new ArrayList<>();
    static List<Drone> drones = new ArrayList<>();

    public static void main(String[] args) {
        Trip managerTrip = new Trip();

        Drone drone1 = new Drone("Drone 1", 60);
        Drone drone2 = new Drone("Drone 2", 20);
        Drone drone3 = new Drone("Drone 3", 80);

        Location location1 = new Location("Location 1", 10);
        Location location2 = new Location("Location 2", 20);
        Location location3 = new Location("Location 3", 30);
        Location location4 = new Location("Location 4", 40);
        Location location5 = new Location("Location 5", 50);


        drones.add(drone1);
        drones.add(drone2);
        drones.add(drone3);

        locations.add(location1);
        locations.add(location2);
        locations.add(location3);
        locations.add(location4);
        locations.add(location5);


        managerTrip.managerTrip(drones, locations);
    }
}