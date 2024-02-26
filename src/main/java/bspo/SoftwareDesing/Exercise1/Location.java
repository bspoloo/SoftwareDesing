package bspo.SoftwareDesing.Exercise1;

public class Location {
    private String location;
    private int packWeight;
    public Location(String location, int packWeight){
        this.location = location;
        this.packWeight = packWeight;
    }
    public String getLocation() {
        return location;
    }

    public int getPackWeight() {
        return packWeight;
    }

}
