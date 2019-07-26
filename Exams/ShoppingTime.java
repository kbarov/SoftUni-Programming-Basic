import java.util.Scanner;

public class ShoppingTime {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int timeToRest = Integer.parseInt(scanner.nextLine());
        double priceForOnePeriphery = Double.parseDouble(scanner.nextLine());
        double priceForOneProgram = Double.parseDouble(scanner.nextLine());
        double priceForWhiteFrappe = Double.parseDouble(scanner.nextLine());

        double timeToFrappe = timeToRest - 5;
        double timeToPeriphery = 3 * 2;
        double timeToProgram = 2 * 2;

         double timeToChill = timeToFrappe - (timeToPeriphery + timeToProgram);
         double spendMoneyForPeriphery = 3 * priceForOnePeriphery;
         double spendMoneyForProgram = 2 * priceForOneProgram;
         double allSpendMoney = spendMoneyForProgram + spendMoneyForPeriphery + priceForWhiteFrappe;
        System.out.printf("%.2f%n",allSpendMoney);
        System.out.printf("%.0f",timeToChill);
    }
}
