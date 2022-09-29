package animalgps;
import java.util.*;
import java.util.Scanner;
/** Vance Nguyen
 * CIS-059
 * African Big Cats Project
 */
public class App 
{
    static Scanner scanning;

    public static void main(String[] args) {
        scanning = new Scanner(System.in);
        ArrayList<Panthera> p = new ArrayList<>();
        char select = ' ';
        do {
            select = menu();
            switch (select) {
                case 'c':
                    createCat(p);
                    break;
                case 'd':
                    deletingCat(p);
                    break;
                case 'f':
                    findCats(p);
                    break;
                case 'l':
                    listCats(p);
                    break;
                case 'q':
                    quit();
                    break;
                case 'r':
                    riskReport(p);
                    break;
                    case 'w':
                    warningReport(p);
                    break;
                default:
                    System.out.println("Error: Illegal input");
            }
        } while(select != 'q');
        scanning.close();

    }
    public static char menu() {
        char command  = ' ';
        System.out.println("-----------------------------");
        System.out.println("African Cats");
        System.out.println("-----------------------------");
        System.out.println("c \t Creates a cat");
        System.out.println("d \t Deletes a cat");
        System.out.println("f \t Find a cat");
        System.out.println("l \t List all Cats");
        System.out.println("q \t Quit");
        System.out.println("r \t Risk Report");
        System.out.println("w \t Warning Report");
        System.out.println("-----------------------------");
        System.out.print("Enter a command: ");
        command = scanning.next().charAt(0);
        return Character.toLowerCase(command);
    }
    public static void createCat(ArrayList<Panthera> p) {
        boolean check = false;
        System.out.print("Enter a name for the cat: ");
        String namer = scanning.next();
        for (int y = 0; y < p.size(); y++) {
            if (namer.equals(p.get(y).name())) {
                System.out.println("Error: This name is taken: ");
                check  = true;
                break;
            }
        }
        if (check == false) {
            try {
                System.out.print("Enter 1 for Tiger, 2 for Lion, and 3 for Jagur: ");
            int choice = scanning.nextInt();
            switch (choice) {
                case 1: 
                    Tiger t = new Tiger(namer);
                    p.add(t);
                    break;
                case 2:
                    Lion l = new Lion(namer);
                    p.add(l);
                    break;
                case 3:
                    Jaguar j = new Jaguar(namer);
                    p.add(j);
                    break;
                default: 
                System.out.println("Error species not fount. Defaulting species to Tiger");
                Tiger e = new Tiger(namer);
                p.add(e);

            }
            System.out.println("\nSTATUS: " + namer + " has been added");

            }catch (Exception e) {
                System.out.println("Error: Enter a number next time");
                scanning.nextLine();
            }
            
        }
    }
    public static void listCats(ArrayList<Panthera> p) {
        if (p.size() > 0 ) {
            for (Panthera a: p) {
                System.out.println(a);
            }
        }
        else {
            System.out.println("Error: There ain't no cats here");
        }
    }
    private static void findCats(ArrayList<Panthera> p) {
        boolean locater = false;
        System.out.print("Enter cat's name: ");
        String catter =  scanning.next();
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).name().contains(catter)) {
                System.out.println(p.get(i));
                locater = true;
            }
        }
        if (locater == false) {
            System.out.println("Error: cant find cat");
        }
    }
    private static void deletingCat (ArrayList<Panthera> p) {
        System.out.print("Enter name of cat to delete ");
        String catter = scanning.next();
        for (int i = 0; i < p.size(); i++) {
            if (catter.equals(p.get(i).name())) {
                p.remove(i);
                return;
            }
        }
        System.out.println("Error: can't find cat");
    }
    private static void riskReport(ArrayList<Panthera> p) {
        boolean locater = false;
        boolean locate2  = false;
        int catnumb1 = 0;
        int catnumb2 = 0;
        System.out.print("Enter first cat's name: ");
        String cat1 =  scanning.next();
        System.out.print("Enter second cat's name: ");
        String cat2 =  scanning.next();
        for (int i = 0; i < p.size(); i++) {
            if (cat1.equals(p.get(i).name())) {
                catnumb1 = i;
                locater = true;
            }
            else if (cat2.equals(p.get(i).name())) {
                catnumb2  = i;
                locate2 = true;
        }
    }
        if (locater == false) {
            System.out.println("Error: cant find cat1");
        }
        else if (locate2 == false) {
            System.out.println ("Error: cant find cat2");
        }
        else if (locater == true && locate2 == true) {
            System.out.println(p.get(catnumb1));
            System.out.println(p.get(catnumb2));
            double z = Math.sqrt(Math.pow((p.get(catnumb2).longitude() - p.get(catnumb1).longitude()), 2) + Math.pow((p.get(catnumb2).latitude()- p.get(catnumb1).latitude()), 2));
            System.out.printf("The distance between " + p.get(catnumb1).name() + " and " + p.get(catnumb2).name() + " is %.2f \n", z);
        }
       
    }
    private static void warningReport(ArrayList<Panthera> p) {
       try {
        ArrayList<Double> distance = new ArrayList<>();
        double totaldis = 0;
        System.out.print("Enter your longitude: ");
        Double yourlongitude =  scanning.nextDouble();
        System.out.print("Enter your latitude: ");
        Double yourlatitude =  scanning.nextDouble();
        for (int i = 0; i < p.size(); i++) {
            totaldis = Math.sqrt(Math.pow((yourlongitude - p.get(i).longitude()), 2) + Math.pow((yourlatitude- p.get(i).latitude()), 2));
            distance.add(totaldis);
        }

        double x = Collections.min(distance);
        
        for (int i = 0; i < p.size(); i++) {
            if (x == distance.get(i)) {
                System.out.println(p.get(i));
                System.out.printf("the closest cat is " + p.get(i).name() + " which is at a distances of %.2f \n", x);
                break;
            }
        }

        } catch (Exception e) {
            System.out.println("Error, illegal input");
            scanning.nextLine();
        }
       }
       public static void quit() {
        System.out.println("\n-----------------------------");
        System.out.println("Thank you for using the African Big Cats App.");
        System.out.println("-----------------------------\n");
       }
       
    }




