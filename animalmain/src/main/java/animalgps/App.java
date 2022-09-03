package animalgps;
import java.util.*;
import java.net.JarURLConnection;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

import main.java.animalgps.Jaguar;
import main.java.animalgps.Lion;
import main.java.animalgps.Tiger;
import main.java.animalgps.panthera;

/**
 * Hello world!
 *
 */
public class App 
{
    static Scanner boi;

    public static void main(String[] args) {
        boi = new Scanner(System.in);
        ArrayList<panthera> p = new ArrayList<>();
        char select = ' ';
        do {
            select = menu();
            switch (select) {
                case 'c':
                    sop("creating");
                    crate(p);
                    break;
                case 'd':
                    sop("deletling");
                    break;
                case 'f':
                    sop("finding");
                    break;
                case 'l':
                    sop("lisitng");
                    listcats(p);
                    break;
                case 'q':
                    break;
                default:
                    sop("Illegal input");
            }
        } while(select != 'q');
        boi.close();

    }
    public static char menu() {
        char command  = ' ';
        sop("-----------------------------");
        sop("African Cats");
        sop("-----------------------------");
        sop("c \t Creates a cat");
        sop("d \t Deletes a cat");
        sop("f \t Find a cat");
        sop("l \t List all Cats");
        sop("q \t Quit");
        sop("-----------------------------");
        System.out.print("Enter a command ");
        command = boi.next().charAt(0);
        return Character.toLowerCase(command);
    }
    public static void crate(ArrayList<panthera> p) {
        sop("Enter a name for the cat");
        String namer = boi.next();
        sop("Enter 1 for Tiger, 2 for Lion, and 3 for Jagur");
        int choice = boi.nextInt();
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
            sop("Error");
        }
        sop("STATUS: " + namer + " has been added");
    }
    public static void listcats(ArrayList<panthera> p) {
        for (panthera a: p) {
            sop(a);
        }
    }












    public static void sop(Object x) {
        System.out.println(x);
    }
    public static void sopr(Object x) {
        System.out.print(x);
    }
}

