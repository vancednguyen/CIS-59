package caluclator;

/** Vance Nguyen
 * CIS-059 OOP
 * 09/04/2022
 */
import java.util.Scanner;

public class App 
{
    static Scanner scanning;

    public static void main(String[] args) {
        float numberA = 0.000f;
        float numberB = 0.000f;
        scanning = new Scanner(System.in);
        String select = " ";
        try {
            do {
                select = displayCal(numberA, numberB);
                switch (select) {
                    case "a":
                        numberA = setA();
                        break;
                    case "b":
                        numberB = setB();
                        break;
                    case "+":
                        numberA = add(numberA, numberB);
                        break;
                    case "-":
                        numberA = subtract(numberA, numberB);
                        break;
                    case "*":
                        numberA = multiply(numberA, numberB);
                        break;
                    case "/":
                        numberA = divide(numberA, numberB);
                        break;
                    case "c":
                        numberA = 0.000f;
                        numberB = 0.000f;
                        break;
                    case "q":
                        break;
                    default:
                        System.out.println("Illegal input");
                }
            } while (!select.equals("q"));
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
       scanning.close();
    }


    public static String displayCal(float numberA, float numberB) {
        String command = "";
        System.out.println("-----------------------------");
        System.out.println("Chavvi Calc");
        System.out.println("-----------------------------");
        System.out.printf("A = %.3f \t", numberA);
        System.out.printf("B = %.3f \n", numberB);
        System.out.println("-----------------------------");
        System.out.println("a \t Enter a value for A");
        System.out.println("b \t Enter b value for B");
        System.out.println("+ \t Add ");
        System.out.println("- \t Subtract");
        System.out.println("* \t Multiply");
        System.out.println("/ \t Divide");
        System.out.println("c \t Clear");
        System.out.println("q \t Quit");
        System.out.println("-----------------------------");
        System.out.print("Enter a command ");
        command = scanning.nextLine().toLowerCase();
        return command;
    }

    static Float setA() {
        try{
            Float number = 000f;
            System.out.print("Enter a number ");
            number = scanning.nextFloat();
            scanning.nextLine();
            return number;
        }catch(Exception e) {
            System.out.println("Error: Enter a number next time");
            scanning.nextLine();
            return 0.000f;
        }
    }
    static Float setB() {
        try {
            Float number = 000f;
            System.out.print("Enter a number ");
            number = scanning.nextFloat();
            scanning.nextLine();
            return number;
        } catch (Exception e) {
            System.out.println("Error: Enter a number next time");
            scanning.nextLine();
            return 0.000f;
        }
    }
    
    static Float add(Float x, Float y) {
        return x + y;
    }
    static Float subtract(Float x, Float y) {
        return x - y;
    }
    static Float multiply(Float x, Float y) {
        return x * y;
    }
    static Float divide(Float x, Float y) {
        if (x == 0 || y ==0){
            System.out.println("Error: can't divide 0");
            return 0.000f;
        }
        else {
            return x / y;
        }
    }
}