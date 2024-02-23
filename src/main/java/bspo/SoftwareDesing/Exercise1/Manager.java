package bspo.SoftwareDesing.Exercise1;

import java.util.ArrayList;

public class Manager {
    ArrayList<Location> tripsDrone;
    public void calculateTrip(Drone drone, Location location){
        if (drone.maxWeight <= location.packWeight){
            tripsDrone.add(location);
        }
    }

}
