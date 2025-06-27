import java.util.Scanner;
public class task2Calculator 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double num1 = sc.nextDouble();
        System.out.print("Enter an operator (+,-,*,/):");
        char operator = sc.next().charAt(0);
        System.out.print("Enter Second Number:");
        double num2 = sc.nextDouble();
        double result = 0 ;
        if (operator == '+') result = num1 + num2;
        else if (operator == '-') result = num1 - num2;
        else if (operator == '*') result = num1 * num2;
        else if (operator == '/' && num2 != 0) result = num1 / num2;
        else {
            System.out.print("Error: Invalid operation");
            sc.close();
            return;
        }
        System.out.print("Result: " + result);
        sc.close();
    }
}
