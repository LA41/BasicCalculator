
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        //store input
        double n1, n2;
        //take input from a user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        System.out.println("Enter the sign (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1 * n2;
            case '/' -> result = n1 / n2;
            default -> System.out.println("Wrong input");
        }
        System.out.println("Final result: " + n1 + " " + op + " " + n2 + " = " + result);
    }
}