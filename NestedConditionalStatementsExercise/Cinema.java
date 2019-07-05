import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projector = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0.0;
        switch (projector) {
            case "Premiere":
                ticketPrice = 12;
                break;
            case "Normal":
                ticketPrice = 7.5;
                break;
            case "Discount":
                ticketPrice = 5;
                break;

        }
        System.out.printf("%.2f leva", (ticketPrice * r * s));
    }

}
