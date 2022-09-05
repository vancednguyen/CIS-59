package animalgps;

public class Tiger extends Panthera{
    public Tiger(String name) {
        super(name);
    }
    public String species() {
        return "Tiger";
    }
    public String fur() {
        return "stripes";
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
