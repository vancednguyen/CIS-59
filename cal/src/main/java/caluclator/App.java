package caluclator;

/** Vance Nguyen
 * CIS-059 OOP
 * 08/30/2022
 */
import java.util.Scanner;

public class App 
{
    static Scanner boi;

    public static void main(String[] args) {
        float numba = 0.000f;
        float numbb = 0.000f;
        boi = new Scanner(System.in);
        String select = " ";
        try {
            do {
                select = displaycal(numba, numbb);
                switch (select) {
                    case "a":
                        numba = SetA();
                        break;
                    case "b":
                        numbb = SetB();
                        break;
                    case "+":
                        numba = add(numba, numbb);
                        break;
                    case "-":
                        numba = subtract(numba, numbb);
                        break;
                    case "*":
                        numba = mulitply(numba, numbb);
                        break;
                    case "/":
                        numba = divide(numba, numbb);
                        break;
                    case "c":
                        numba = 0.00f;
                        numbb = 0.00f;
                        break;
                    case "q":
                        break;
                    default:
                        sop("Illegal input");
                }
            } while (!select.equals("q"));
        } catch (Exception e) {
            sop("Something went wrong");
            e.printStackTrace();
        }
       boi.close();
    }

    public static void sop(Object x) {
        System.out.println(x);
    }
    public static void sopr(Object x) {
        System.out.print(x);
    }

    public static String displaycal(float numba, float numbb) {
        String command = "";
        sop("-----------------------------");
        sop("Chavvi Calc");
        sop("-----------------------------");
        System.out.printf("A = %.3f \t", numba);
        System.out.printf("B = %.3f \n", numbb);
        sop("-----------------------------");
        sop("a \t Enter a value for A");
        sop("b \t Enter b value for B");
        sop("+ \t Add ");
        sop("- \t Subtract");
        sop("* \t Multiply");
        sop("/ \t Divide");
        sop("c \t Clear");
        sop("q \t Quit");
        sop("-----------------------------");
        sopr("Enter a command ");
        command = boi.nextLine().toLowerCase();
        return command;

    }

    static float SetA() {
        try{
            float number = 0;
            sopr("Enter a number ");
            number = boi.nextFloat();
            boi.nextLine();
            return number;
        }catch(Exception e) {
            sop("Error: Enter a number next time");
            boi.nextLine();
            return 0;
        }
    }
    static float SetB() {
        try {
            float number = 0;
            sopr("Enter a number ");
            number = boi.nextFloat();
            boi.nextLine();
            return number;
        } catch (Exception e) {
            sop("Error: Enter a number next time");
            boi.nextLine();
            return 0;
        }
    }
    static float add(Float x, Float y) {
        return x + y;
    }
    static float subtract(float x, float y) {
        return x - y;
    }
    static float mulitply(float x, float y) {
        return x * y;
    }
    static float divide(float x, float y) {
        if (x == 0 || y ==0){
            sop("Error: can't divide 0");
            return 0;
        }
        else {
            return x / y;
        }
    }
}