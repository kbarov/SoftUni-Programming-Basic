import java.util.Scanner;

public class GoingHome {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double distanceKm = Double.parseDouble(scanner.nextLine());
        double expense100Km = Double.parseDouble(scanner.nextLine());
        double priceForGasolineForOneLiter = Double.parseDouble(scanner.nextLine());
        double moneyEarned = Double.parseDouble(scanner.nextLine());

        double expenseCar = (distanceKm * expense100Km) / 100;
        double allExpense = expenseCar * priceForGasolineForOneLiter;
        double result = Math.abs(allExpense - moneyEarned);
        double allocation = moneyEarned / 5;


        if (moneyEarned >= allExpense){
            System.out.printf("You can go home. %.2f money left.", result);
        }else if (moneyEarned < allExpense){
            System.out.printf("Sorry, you cannot go home. Each will receive %.2f money.", allocation);
        }
    }
}
