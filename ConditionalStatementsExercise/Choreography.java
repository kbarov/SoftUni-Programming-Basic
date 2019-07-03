import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double steps = Double.parseDouble(scanner.nextLine());
        double dancers = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());

        double stepsPerDay = Math.ceil((steps  / days) / steps * 100);
        double procentStepPerDancer = stepsPerDay / dancers;

        if (stepsPerDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", procentStepPerDancer);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.",procentStepPerDancer);
        }
    }
}