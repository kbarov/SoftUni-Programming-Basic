import java.util.Scanner;

public class Travelling {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String country = "";

        while (!country.equals("End")) {
            country = scanner.nextLine();
            if (country.equals("End")) {
                break;
            }
            double budget = Double.parseDouble(scanner.nextLine());
            double totalSum = 0;
            while (totalSum < budget) {
                double savedSum = Double.parseDouble(scanner.nextLine());
                totalSum += savedSum;
            }
            System.out.printf("Going to %s!\n", country);
        }
    }
}