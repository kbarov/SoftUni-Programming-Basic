import java.util.Scanner;

public class TrapeziotArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double res = ((b1 + b2) * h) / 2;

        System.out.println(res);


    }

}