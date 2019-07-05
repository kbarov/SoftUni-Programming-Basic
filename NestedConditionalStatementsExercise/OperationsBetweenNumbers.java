import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();


        double collection = n1 + n2;
        double subtraction = n1 - n2;
        double multiplication = n1 * n2;
        double division = n1 / n2;
        double modularDivision = n1 % n2;


        switch (operator) {
            case "+":
                if (collection % 2 == 0) {
                    System.out.printf("%.0f + %.0f = %.0f - even", n1, n2, collection);
                } else  {
                    System.out.printf("%.0f + %.0f = %.0f - odd", n1, n2, collection);
                }
                break;
            case "-":
                if (subtraction % 2 == 0) {
                    System.out.printf("%.0f - %.0f = %.0f - even", n1, n2, subtraction);
                } else  {
                    System.out.printf("%.0f - %.0f = %.0f - odd", n1, n2, subtraction);
                }
                break;
            case "*":
                if (multiplication % 2 == 0) {
                    System.out.printf("%.0f * %.0f = %.0f - even", n1, n2, multiplication);
                } else if (multiplication % 2 == 1) {
                    System.out.printf("%.0f * %.0f = %.0f - odd", n1, n2, multiplication);
                }
                break;
            case "/":
                if (n1 == 0 || n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    System.out.printf("%.0f / %.0f = %.2f", n1, n2, division);
                }
                break;
            case "%":
                if (n1 == 0 || n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    System.out.printf("%.0f %% %.0f = %.0f", n1, n2, modularDivision);
                }
                break;

        }

    }
}
