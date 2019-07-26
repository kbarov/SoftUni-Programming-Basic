import java.util.Scanner;

public class StadiumIncome {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int numbOfSectorsStadium = Integer.parseInt(scanner.nextLine());
        int capacityOfTheStadium = Integer.parseInt(scanner.nextLine());
        double priceOfticket = Double.parseDouble(scanner.nextLine());

        double incomeForOneSector = (capacityOfTheStadium * priceOfticket) / numbOfSectorsStadium;
        double allIncome = incomeForOneSector * numbOfSectorsStadium;
        double moneyForCharity = (allIncome - (incomeForOneSector * 0.75)) / 8;

        System.out.printf("Total income - %.2f BGN%n", allIncome);
        System.out.printf("Money for charity - %.2f BGN", moneyForCharity);
    }
}
