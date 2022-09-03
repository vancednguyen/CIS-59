package main.java.animalgps;

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
        s += " }";
        return s;
    }
    public String fur() {
        return "Panthera";
    }

    
}
