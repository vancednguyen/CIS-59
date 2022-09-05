package animalgps;

public class Panthera extends PantheraGPS {

    private final Float maxweight = 600.0f;
    private final Float minweight = 10.0f;
    private Float weighting;

    public Panthera(String name) {
        super(name);
        // call the super-class (parent) to instatiate it
        // initialize attributes
        this.setSpecies("Panthera");
        //randomizes the wieght between 10 and 600
        this.weighting = (float) (Math.random() *maxweight) +minweight;
    }
    public Float speed() {
        float speeding = (float) (Math.random() * maxSpeed) + minSpeed;
        return speeding;
      }
    public Float weight() {
        return this.weighting;
    }
    public static void roar() {
        sop("Rrrrrrrrroooooooaaaaarrrrr!");
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

    

    
}
