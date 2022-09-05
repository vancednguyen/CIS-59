package animalgps;
import java.util.Random;

public class Jaguar extends Panthera {
    private String sleeps;
    Random randomNum = new Random();
    public Jaguar(String name) {
        super(name);
        //randomizes to see if the cat sleeps in a tree
        int rand = randomNum.nextInt(2);
        if (rand == 1){
            this.sleeps = "True";
        }
        else {
            this.sleeps = "False";
        }
    }
    
    public String fur() {
        return "spots";
    }
    public String species() {
        return "Jaguar";
    }

    public String sleepsintrees() {
        return this.sleeps;
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
