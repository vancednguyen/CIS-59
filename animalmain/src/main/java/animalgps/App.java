package animalgps;
import java.util.*;
import java.net.JarURLConnection;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

import javax.lang.model.element.Parameterizable;



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
                    crate(p);
                    break;
                case 'd':
                    deletingcat(p);
                    break;
                case 'f':
                    findcats(p);
                    break;
                case 'l':
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
        int check = 0;
        sop("Enter a name for the cat");
        String namer = boi.next();
        for (int y = 0; y < p.size(); y++) {
            if (namer.equals(p.get(y).name())) {
                sop("this name is taken");
                check  = 1;
                break;
            }
        }
        if (check == 0) {
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
                    sop("please select one the options next time");
                    Tiger e = new Tiger(namer);
                    p.add(e);
            }
            sop("STATUS: " + namer + " has been added");
        }
    }
    public static void listcats(ArrayList<panthera> p) {
        if (p.size() > 0 ) {
            for (panthera a: p) {
                sop(a);
            }
        }
        else {
            sop("There aint no cats here");
            sop(p.size());
        }
    }
    private static void findcats(ArrayList<panthera> p) {
        int locater = 0;
        sop("Enter cat's name");
        String catter =  boi.next();
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).name().contains(catter)) {
                sop(p.get(i));
                locater = 1;
            }
        }
        if (locater == 0) {
            sop("cant find cat");
        }
    }
    private static void deletingcat (ArrayList<panthera> p) {
        int locater = 0;
        sop("Enter name of cat to delete");
        String catter = boi.next();
        for (int i = 0; i < p.size(); i++) {
            if (catter.equals(p.get(i).name())) {
                p.remove(i);
                locater = 1;
            }
        }
        if (locater == 0) {
            sop("cant find cat");
        }

    }

    public static void sop(Object x) {
        System.out.println(x);
    }
    public static void sopr(Object x) {
        System.out.print(x);
    }
}

