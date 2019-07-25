import java.util.Scanner;

public class BeerAndChips {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String nameOfFan = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfBottleBeer = Integer.parseInt(scanner.nextLine());
        int numberOfChips = Integer.parseInt(scanner.nextLine());

        double allPriceForBeer = 1.20 * numberOfBottleBeer;
        double priceOfOnePacketChips = allPriceForBeer * 0.45;
        double allPriceForChips = Math.ceil(priceOfOnePacketChips * numberOfChips);
        double allPrice = allPriceForBeer + allPriceForChips;

        if (allPrice <= budget){
            System.out.printf("%s bought a snack and has %.2f leva left.%n", nameOfFan , (budget - allPrice));
        }else {
            System.out.printf("%s needs %.2f more leva!", nameOfFan, (allPrice - budget));
        }
    }
}
