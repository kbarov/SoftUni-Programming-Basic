import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyFood = Double.parseDouble(scanner.nextLine());
        double moneySouvenirs = Double.parseDouble(scanner.nextLine());
        double moneyHotel = Double.parseDouble(scanner.nextLine());

        double gasoline = 29.4;
        double priceToGasoline = gasoline * 1.85;
        double stay = (3 * moneyFood) + (3 * moneySouvenirs);
        double firstDay = moneyHotel * 0.9;
        double secondDay = moneyHotel * 0.85;
        double thirdDay = moneyHotel * 0.8;
        double allSum = priceToGasoline + stay + firstDay + secondDay + thirdDay;
        System.out.printf("Money needed: %.2f", allSum);
    }
}
