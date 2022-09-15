package animalgps;
import java.util.Random;

public class Jaguar extends Panthera {
    private Boolean sleeps;
    private Random randomNum; 
    public Jaguar(String name) {
        super(name);
        //randomizes to see if the cat sleeps in a tree
        randomNum = new Random();
        int rand = randomNum.nextInt(2);
        if (rand == 1){
            this.sleeps = true;
        }
        else {
            this.sleeps = false;
        }
    }
    public String species() {
        return "Jaguar";
    }

    public String fur() {
        return "spots";
    }

    public Boolean sleepsInTrees() {
        return this.sleeps;
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
        s += ", ";
        s += "Does sleep in a tree: " + sleepsInTrees();
        s += " }";
        return s;
    }

}
