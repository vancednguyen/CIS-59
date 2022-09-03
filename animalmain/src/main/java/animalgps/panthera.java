package animalgps;

import java.net.SocketPermission;

public class panthera extends PantheraGPS{
     // constructor
     public panthera(String name) {
        super(name);
        // call the super-class (parent) to instatiate it
        // initialize attributes
        this.setSpecies("panthera");
    }
    // serializes attributes into a string
    @Override // override superclass method
    public String toString() {
        String s;
        // since the object is complex, we return a JSON formatted string
        s = "{ ";
        s += "name: " + this.name();
        s += ", ";
        s += "species: " + this.species();
        s += ", ";
        s += "longitude: " + this.longitude();
        s += ", ";
        s += "latitude: " + this.latitude();
        s += ", ";
        s += "speed: " + this.speed();
        s += ", ";
        s += "weight: " + this.weight();
        s += "}";
        return s;
    }
    public Float speed() {
        float speeding = (float) (Math.random() * maxSpeed) + minSpeed;
        return speeding;
      }
    public Float weight() {
        float weighting = (float) (Math.random() *600) +10;
        return weighting;
    }
    public static void roar() {
        sop("Rrrrrrrrroooooooaaaaarrrrr!");
    }

    
}
