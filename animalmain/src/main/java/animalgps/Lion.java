package animalgps;

public class Lion extends Panthera {
    public Lion(String name) {
        super(name);
    }
    public String species() {
        return "Lion";
    }
    public String fur() {
        return "mane";
    }
    @Override // override superclass method
    public String toString() {
        String s;
        // since the object is complex, we return a JSON formatted string
        s = "{ ";
        s += "name: " + name();
        s += ", ";
        s += "species: " + this.species();
        s += ", ";
        s += "longitude: " + longitude();
        s += ", ";
        s += "latitude: " + latitude();
        s += ", ";
        s += "speed: " + speed();
        s += ", ";
        s += "fur: " + this.fur();
        s += ", ";
        s += "weight: " + weight();
        s += " }";
        return s;
    }
}
