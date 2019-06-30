import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double celsium = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (1.8 * celsium) + 32;

        System.out.println(fahrenheit);
    }
}
