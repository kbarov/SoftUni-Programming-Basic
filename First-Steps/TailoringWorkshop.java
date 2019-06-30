import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class TailoringWorkshop {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double count = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double pokrivki = count * (lenght + (2 * 0.30)) * (width + (2 * 0.30));
        double kareta = count * (lenght / 2) * (lenght / 2);
        double priceUSD = pokrivki * 7 + kareta * 9;
        double priceBGN = priceUSD * 1.85;

        System.out.printf("%.2f USD\n", priceUSD);
        System.out.printf("%.2f BGN", priceBGN);

    }
}
