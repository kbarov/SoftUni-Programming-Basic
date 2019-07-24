import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWiskey = Double.parseDouble(scanner.nextLine());
        double countWater = Double.parseDouble(scanner.nextLine());
        double countWIne = Double.parseDouble(scanner.nextLine());
        double countShampaine = Double.parseDouble(scanner.nextLine());
        double countWiskey = Double.parseDouble(scanner.nextLine());

        double priceShampaine = priceWiskey * 0.5;
        double priceWine = priceShampaine * 0.4;
        double priceWater = priceShampaine * 0.1;
        double sumShampaine = countShampaine * priceShampaine;
        double sumWine = countWIne * priceWine;
        double sumWater = countWater * priceWater;
        double sumWiskey = countWiskey * priceWiskey;
        double allSum = sumShampaine + sumWine + sumWater + sumWiskey;

        System.out.printf("%.2f", allSum);
    }
}
