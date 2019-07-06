import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int vGlass = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counts = 0;
        String size = "";

        while (true) {
            size = scanner.nextLine();
            if ("Easy".equals(size)) {
                sum += 50;
            } else if ("Medium".equals(size)) {
                sum += 100;
            } else if ("Hard".equals(size)) {
                sum += 200;
            }
            counts++;

            if (sum == vGlass) {
                System.out.printf("The dispenser has been tapped %d times.", counts);
                break;
            } else if (sum > vGlass) {
                System.out.printf("%dml has been spilled.", sum - vGlass);
                break;
            }
        }
    }
}