package animalgps;
import java.util.*;
import java.util.Scanner;




/**
 * Hello world!
 *
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
                    break;
                default:
                    System.out.println("Illegal input");
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
        System.out.println("-----------------------------");
        System.out.print("Enter a command ");
        command = scanning.next().charAt(0);
        return Character.toLowerCase(command);
    }
    public static void createCat(ArrayList<Panthera> p) {
        boolean check = false;
        System.out.print("Enter a name for the cat: ");
        String namer = scanning.next();
        for (int y = 0; y < p.size(); y++) {
            if (namer.equals(p.get(y).name())) {
                System.out.println("this name is taken: ");
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
                System.out.println("please select one the options next time");
                    Tiger e = new Tiger(namer);
                    p.add(e);
            }
            System.out.println("\n STATUS: " + namer + " has been added");

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
            System.out.println("There aint no cats here");
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
            System.out.println("cant find cat");
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
        System.out.println("cant find cat");

    }

}

