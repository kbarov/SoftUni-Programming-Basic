import java.util.Scanner;

public class AlcoholMarket {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double priceWiskey = Double.parseDouble(scanner.nextLine());
        double quantityBeer = Double.parseDouble(scanner.nextLine());
        double quantityWine = Double.parseDouble(scanner.nextLine());
        double quantityRakia = Double.parseDouble(scanner.nextLine());
        double quantityWiskey = Double.parseDouble(scanner.nextLine());

        double priceRakia = priceWiskey/2;
        double priceWine = priceRakia - (0.4 * priceRakia);
        double priceBeer = priceRakia - (0.8 * priceRakia);
        double sumRakia = quantityRakia * priceRakia;
        double sumWine = quantityWine * priceWine;
        double sumBeer = priceBeer * quantityBeer;
        double sumWiskey = quantityWiskey * priceWiskey;
        double total = sumRakia + sumWine + sumBeer + sumWiskey;

        System.out.printf("%.2f", total);


    }
}
