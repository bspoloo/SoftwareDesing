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
    public void recharge(int weight){
        if (weight < 0){
            maxWeight = Math.abs(weight);
            System.out.println(name+" recharged "+maxWeight+" of weight");

        }else {
            System.out.println("The max weight was exceeded for "+name);

        }


    }

}
