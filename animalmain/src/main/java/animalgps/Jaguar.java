package animalgps;

public class Jaguar extends panthera {
    public Jaguar(String name) {
        super(name);
    }
    
    public String fur() {
        return "spots";
    }
    public String species() {
        return "Jaguar";
    }

    public String sleepsintrees() {
        int rand = (int) (Math.random() * 2) +1;
        if (rand == 1){
            return "True";
        }
        else {
            return "False";
        }

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
        s += ", ";
        s += "Does sleep in a tree: " + sleepsintrees();
        s += " }";
        return s;
    }

}
