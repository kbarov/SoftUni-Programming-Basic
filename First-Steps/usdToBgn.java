import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class usdToBgn {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double  USD = 1.79549;
        double BGN = Double.parseDouble(scanner.nextLine());
        double value = BGN * USD;

        System.out.printf("%.2f", value);
    }
}
