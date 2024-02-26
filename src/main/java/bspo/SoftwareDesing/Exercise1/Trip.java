package bspo.SoftwareDesing.Exercise1;

import java.util.*;

public class Trip {

    public void managerTrip(List<Drone> drones, List<Location> locations) {

        drones.sort(Comparator.comparingInt(Drone::getMaxWeight).reversed());
        locations.sort(Comparator.comparingInt(Location::getPackWeight));

        for (Drone drone : drones) {

            List<Location> locationsToAdd = new ArrayList<>();

            for (Location location : locations) {

                calculate(drone,location,locationsToAdd);
            }

            drone.trips = locationsToAdd;
            locations.removeAll(locationsToAdd);
        }
        printTrips(drones);
    }

    private void calculate(Drone drone, Location location, List<Location> locationsToAdd) {

        if (drone.getMaxWeight() >= location.getPackWeight()) {

            drone.setMaxWeight(drone.getMaxWeight() - location.getPackWeight());
            locationsToAdd.add(location);

        } else {
            drone.recharge(drone.getMaxWeight() - location.getPackWeight());
            //calculate(drone, location, locationsToAdd);
        }


    }
    public void printTrips(List<Drone> drones) {
        for (Drone drone : drones) {
            System.out.println("Name: " + drone.getName());

            for (int j = 0; j < drone.trips.size(); j++) {
                System.out.println("Location : " + drone.trips.get(j).getLocation());
            }
        }
    }
}
