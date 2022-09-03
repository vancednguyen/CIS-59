package main.java.animalgps;

public class Jaguar extends panthera {
    public Jaguar(String name) {
        super(name);
    }
    
    public String fur() {
        return "spots";
}
    public String sleepsintrees() {
        int rand = (int) (Math.random() * 2) +1;
        if (rand == 1){
            return "sleeping in tree";
        }
        else {
            return "is not sleeping in tree";
        }

    }

}
