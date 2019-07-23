import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPassenger = Integer.parseInt(scanner.nextLine());
        int countStations = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= countStations; i++) {
            int in = Integer.parseInt(scanner.nextLine());
            int out = Integer.parseInt(scanner.nextLine());
            countPassenger = countPassenger - in + out;
            if (i % 2 == 0){
                countPassenger+= - 2;
            } else {
                countPassenger += 2;
            }

        }
        System.out.printf("The final number of passengers is : %d", countPassenger);
    }
}