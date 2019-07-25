import java.util.Scanner;

public class FanShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int numObject = Integer.parseInt(scanner.nextLine());


        int sum = 0;
        int result = 0;

        for (int i = 0; i < numObject; i++) {
            String object = scanner.nextLine();
            switch (object){
                case "hoodie":
                    sum += 30;
                    break;
                case "keychain":
                    sum += 4;
                    break;
                case "T-shirt":
                    sum += 20;
                    break;
                case "flag":
                    sum += 15;
                    break;
                case "sticker":
                    sum += 1;
                    break;
            }
        }
        result = Math.abs(budget - sum);
        if (budget >= sum){
            System.out.printf("You bought %d items and left with %d lv.", numObject , result);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", result);
        }
    }
}
