package bspo.SoftwareDesing;


import bspo.SoftwareDesing.Exercise1.Drone;
import bspo.SoftwareDesing.Exercise1.Manager;
import bspo.SoftwareDesing.Exercise1.Trip;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Trip> trips = new ArrayList<>();
    static ArrayList<Drone> drones = new ArrayList<>();

    public static void main(String[] args) {
        Drone drone1 = new Drone("Drone 1", 500);
        Trip trip1 = new Trip("Sucre", 600);
        Trip trip2 = new Trip("Sucre", 600);
        Trip trip3 = new Trip("Sucre", 600);

        drones.add(drone1);


        trips.add(trip1);
        trips.add(trip2);
        trips.add(trip3);


        Manager manager = new Manager();

        for (int j = 0;j < drones.size(); j++){
            for (int i = 0;i < trips.size(); i++){
                manager.calculateTrip(drones.get(i),trips.get(i));
            }
        }

        System.out.println("For "+ );
    }
}