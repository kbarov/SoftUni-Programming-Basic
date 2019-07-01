import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = (puzzle * 2.6) + (talkingDoll * 3) + (teddyBear * 4.1) + (minions * 8.2) + (trucks * 2);
        int sumToys = puzzle + talkingDoll + teddyBear + minions + trucks;
        double discount = 0.0;
        if (sumToys >= 50){
            discount = sum * 0.25;
        }
        double totalPrice = sum - discount;
        totalPrice = totalPrice - (totalPrice * 0.10);


        if (excursionPrice <= totalPrice){
            System.out.printf("Yes! %.2f lv left.", totalPrice-excursionPrice );
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalPrice-excursionPrice));
        }
    }
}
