import java.util.Scanner;

public class WeddingParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int kuvert = people * 20;


        if (budget >= kuvert){
            budget -= kuvert;
            double money = budget * 0.40;
            double moneyForCharity = budget - money;
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", money, moneyForCharity);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", kuvert - budget);
        }
    }
}
