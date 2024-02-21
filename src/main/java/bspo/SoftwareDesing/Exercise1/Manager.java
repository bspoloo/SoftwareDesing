package bspo.SoftwareDesing.Exercise1;

import java.util.ArrayList;

public class Manager {
    ArrayList<Trip> tripsDrone;
    public void calculateTrip(Drone drone, Trip trip){
        if (drone.maxWeight <= trip.packWeight){
            tripsDrone.add(trip);
        }
    }

}
