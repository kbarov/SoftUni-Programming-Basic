import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double profit = 0;
        double cost = 0;
        int count = 0;

        while (true) {
            String f = scanner.nextLine();
            if ("Stop".equals(f)) {
                if (profit > cost) {
                    System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", count, profit - cost);
                } else {
                    System.out.printf("Lyubo lost %.2f leva today.", cost - profit);
                }
                return;
            }
            count++;
            String q = scanner.nextLine();

            for (int k = 0; k <= f.length() - 1; k++) {

                if (count % 3 == 0) {
                    profit += (f.charAt(k) / Double.parseDouble(q));
                } else {
                    cost += (f.charAt(k) / Double.parseDouble(q));
                }
            }

            if (count == n) {
                break;
            }
        }
        System.out.println("Lyubo fulfilled the quota!");
        if (profit > cost) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", count, profit - cost);
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", cost - profit);
        }

    }

}