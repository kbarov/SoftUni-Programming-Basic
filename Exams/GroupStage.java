import java.util.Scanner;

public class GroupStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int maches = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int goalsDiff = 0;
        int result = 0;
        int sumGoalsIn = 0;
        int sumGoalsOut = 0;

        for (int i = 0; i < maches; i++) {
            int goalsIn = Integer.parseInt(scanner.nextLine());
            int goalsOut = Integer.parseInt(scanner.nextLine());

            if (goalsIn > goalsOut){
                sum += 3;
                sumGoalsIn += goalsIn;
                sumGoalsOut += goalsOut;
            } else if (goalsIn == goalsOut){
                sum += 1;
                sumGoalsIn += goalsIn;
                sumGoalsOut += goalsOut;
            } else {
                sumGoalsIn += goalsIn;
                sumGoalsOut += goalsOut;
            }
            goalsDiff = goalsIn - goalsOut;
            result += goalsDiff;


        }

        if (sumGoalsIn >= sumGoalsOut){
            System.out.printf("%s has finished the group phase with %d points.\n", team , sum);
            System.out.printf("Goal difference: %d.", result);
        } else {
            System.out.printf("%s has been eliminated from the group phase.\n",team);
            System.out.printf("Goal difference: %d.",result);
        }

    }
}
