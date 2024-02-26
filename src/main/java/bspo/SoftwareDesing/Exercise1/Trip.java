package bspo.SoftwareDesing.Exercise1;

import java.util.*;

public class Trip {

    public void managerTrip(List<Drone> drones, List<Location> locations){

        drones.sort(Comparator.comparingInt(Drone::getMaxWeight).reversed());
        locations.sort(Comparator.comparingInt(Location::getPackWeight));

        for (Drone drone : drones) {

            List<Location> locationsToAdd = new ArrayList<>();

            for (Location location : locations) {

                if (drone.getMaxWeight() >= location.getPackWeight()) {
                    drone.setMaxWeight(drone.getMaxWeight() - location.getPackWeight());

                    locationsToAdd.add(location);
                    //drone.addLocation(locations.remove(j));
                }
            }

            drone.trips = locationsToAdd;
            locations.removeAll(locationsToAdd);
        }
        printTrips(drones);
    }
    public void printTrips(List<Drone> drones){
        for (Drone drone : drones) {
            System.out.println("Name: " + drone.getName());

            for (int j = 0; j < drone.trips.size(); j++) {
                System.out.println("Location : " + drone.trips.get(j).getLocation());
            }
        }
    }
}
