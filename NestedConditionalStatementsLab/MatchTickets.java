import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numPeople = Integer.parseInt(scanner.nextLine());

        double transportprice = 0;

        if (numPeople >= 1 && numPeople <= 4) {
            transportprice = budget * 0.75;
        } else if (numPeople >= 5 && numPeople <= 9) {
            transportprice = budget * 0.60;
        } else if (numPeople >= 10 && numPeople <= 24) {
            transportprice = budget * 0.50;
        } else if (numPeople >= 25 && numPeople <= 49) {
            transportprice = budget * 0.40;
        } else {
            transportprice = budget * 0.25;
        }

        double restMoney = budget - transportprice;

        double priceTicket = 0;
        switch (category){
            case "VIP":
                priceTicket = 499.99;
                break;
            case "Normal":
                priceTicket = 249.99;
                break;

        }

        double allPriceTicket = priceTicket * numPeople;

        if (restMoney >= allPriceTicket){
            System.out.printf("Yes! You have %.2f leva left.", restMoney - allPriceTicket);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", allPriceTicket - restMoney);
        }

    }
}
