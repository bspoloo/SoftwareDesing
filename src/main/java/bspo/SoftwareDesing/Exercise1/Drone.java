package bspo.SoftwareDesing.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Drone {

    private String name;
    private int maxWeight;
    List<Location> trips;

    public Drone(String name, int maxWeight){
        this.name = name;
        this.maxWeight = maxWeight;
        trips = new ArrayList<>();
    }

    public void addLocation(Location trip){
        trips.add(trip);
    }
    public String getName() {
        return name;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

}
