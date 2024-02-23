package bspo.SoftwareDesing.Exercise1;


import bspo.SoftwareDesing.Exercise1.Drone;
import bspo.SoftwareDesing.Exercise1.Manager;
import bspo.SoftwareDesing.Exercise1.Location;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Location> locations = new ArrayList<>();
    static ArrayList<Drone> drones = new ArrayList<>();

    public static void main(String[] args) {
        Drone drone1 = new Drone("Drone 1", 500);
        Location location1 = new Location("Sucre", 600);
        Location location2 = new Location("Sucre", 600);
        Location location3 = new Location("Sucre", 600);

        drones.add(drone1);


        locations.add(location1);
        locations.add(location2);
        locations.add(location3);


        Manager manager = new Manager();

        for (int j = 0;j < drones.size(); j++){
            for (int i = 0; i < locations.size(); i++){
                manager.calculateTrip(drones.get(i), locations.get(i));
            }
        }

    }
}