import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class AreaOfFigures {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("square")){
            double site = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",site * site);
        }else if (input.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", a * b);
        }else if (input.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI * r * r);
        }else {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (a * b /2));
        }
    }
}
