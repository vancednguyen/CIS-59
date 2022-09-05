package animalgps;

public class Lion extends Panthera {
    public Lion(String name) {
        super(name);
    }
    public String fur() {
        return "mane";
    }
    public String species() {
        return "Lion";
    }
    @Override // override superclass method
    public String toString() {
        String s;
        // since the object is complex, we return a JSON formatted string
        s = "{ ";
        s += "name: " + name();
        s += ", ";
        s += "species: " + species();
        s += ", ";
        s += "longitude: " + longitude();
        s += ", ";
        s += "latitude: " + latitude();
        s += ", ";
        s += "speed: " + this.speed();
        s += ", ";
        s += "fur: " + fur();
        s += ", ";
        s += "weight: " + this.weight();
        s += " }";
        return s;
    }
}
