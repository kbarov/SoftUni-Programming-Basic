import java.util.Scanner;

public class FamilyHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int averageCost = Integer.parseInt(scanner.nextLine());


        double sumElectricity = 0;
        double totalSumOther = 0;
        for (int i = 0; i < averageCost; i++) {
            double costElectrisity = Double.parseDouble(scanner.nextLine());
            double other = costElectrisity + 20 + 15;
            double sumOther = other + (other * 0.2);
                    totalSumOther += sumOther;
                    sumElectricity += costElectrisity;
        }

        double water = averageCost * 20;
        double internet = averageCost * 15;
        double averagePerMount = (sumElectricity + water + internet + totalSumOther) / averageCost;


        System.out.printf("Electricity: %.2f lv\n", sumElectricity);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", internet);
        System.out.printf("Other: %.2f lv\n", totalSumOther);
        System.out.printf("Average: %.2f lv", averagePerMount);


    }
}
