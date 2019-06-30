import java.util.Scanner;

public class DanceHall {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double L = Double.parseDouble(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double A = Double.parseDouble(scanner.nextLine());

        double area = (L * 100) * (W * 100);
        double drawer = (A * 100) * (A * 100);
        double bench = area / 10;
        double freeSpace = area - drawer - bench;
        double dancers = freeSpace / (40 + 7000);

        System.out.printf("%.0f",Math.floor(dancers));

    }
}
