import java.util.Scanner;

public class GameInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int numPlayGames = Integer.parseInt(scanner.nextLine());

        double sumDuration = 0;
        double averageDuration = 0;
        int penalties = 0;
        int continued = 0;

        for (int i = 0; i < numPlayGames; i++) {
            double duration = Double.parseDouble(scanner.nextLine());
                sumDuration += duration;

                if (duration > 90 && duration <= 120){
                    continued++;
                }
                if (duration > 120){
                    penalties++;
                }

        }

        averageDuration = sumDuration / numPlayGames;

        System.out.printf("%s has played %.0f minutes. Average minutes per game: %.2f\n", team, sumDuration, averageDuration);
        System.out.printf("Games with penalties: %d\n", penalties);
        System.out.printf("Games with additional time: %d",continued);


    }
}
