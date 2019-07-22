import java.util.Scanner;

public class ShoppingManiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        String command = "";
        String command2 = "";
        String priceStr = "";
        int counter = 0;
        int spent = 0;
        while (!(command2.equals("enough"))) {
            command2 = scanner.nextLine();
            while (command2.equals("enter")) {
                priceStr = scanner.nextLine();
                command = priceStr;
                if (!(priceStr.equals("enter")) && !(priceStr.equals("leave")) && !(priceStr.equals("enough"))) {
                    int price = Integer.parseInt(priceStr);
                    if (price > money) {
                        System.out.println("Not enough money.");
                        continue;
                    }
                    money -= price;
                    spent += price;
                    counter++;
                    if (money <= 0) {
                        System.out.printf("For %d clothes I spent %d lv and have %d lv left.", counter, spent, money);
                        return;
                    }
                }
                if (command.equals("leave")) {
                    break;
                }
            }
        }
        System.out.printf("For %d clothes I spent %d lv and have %d lv left.", counter, spent, money);
    }
}
