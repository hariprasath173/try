import java.util.Scanner;

public class SimpleCalculator {
   
    public void calculate(double num1, double num2, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                System.out.println("Result = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();


        SimpleCalculator calc = new SimpleCalculator();
        calc.calculate(num1, num2, operator);
    }
}