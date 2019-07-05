import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        double counts = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double flowerPrice = 0.0;

        switch (flowers) {
            case "Roses":
                flowerPrice = 5 * counts;
                if (counts > 80) {
                    flowerPrice = flowerPrice * 0.90;
                }
                break;
            case "Dahlias":
                flowerPrice = 3.8 * counts;
                if (counts > 90) {
                    flowerPrice = flowerPrice * 0.85;
                }
                break;
            case "Tulips":
                flowerPrice = 2.8 * counts;
                if (counts > 80) {
                    flowerPrice = flowerPrice * 0.85;
                }
                break;
            case "Narcissus":
                flowerPrice = 3 * counts;
                if (counts < 120) {
                    flowerPrice = flowerPrice * 1.15;
                }
                break;
            case "Gladiolus":
                flowerPrice = 2.5 * counts;
                if (counts < 80) {
                    flowerPrice = flowerPrice * 1.20;
                }

                break;
        }
        if (flowerPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", Math.floor(counts), flowers, budget - flowerPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", flowerPrice - budget);
        }
    }
}