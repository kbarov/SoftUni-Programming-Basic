import java.util.Scanner;

public class TripToWorldCup {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double priceOfTicketForGo = Double.parseDouble(scanner.nextLine());
        double priceOfTicketForReturn = Double.parseDouble(scanner.nextLine());
        double priceOfTicketForOneMach = Double.parseDouble(scanner.nextLine());
        int numberOfMaches = Integer.parseInt(scanner.nextLine());
        int procentDiscount = Integer.parseInt(scanner.nextLine());

        double priceOfАirlineТickets = 6 * (priceOfTicketForGo + priceOfTicketForReturn);
        double airlineTicketsAfterDiscount = priceOfАirlineТickets - (priceOfАirlineТickets * procentDiscount) / 100;
        double allSumForMaches = 6 * numberOfMaches * priceOfTicketForOneMach;
        double allSumForPay =  airlineTicketsAfterDiscount + allSumForMaches;
        double sumForEachPerson = allSumForPay / 6;

        System.out.printf("Total sum: %.2f lv.%n", allSumForPay);
        System.out.printf("Each friend has to pay %.2f lv.", sumForEachPerson);

    }
}
