import java.util.Scanner;

public class VolleyBall {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double weekInSofia = 48;
        double weekOutSofia = (weekInSofia - h) * 3.0 / 4;
        double gamesInSofiaHoliday = p * 2.0 / 3;
        double allGamesHoliday = weekOutSofia + h + gamesInSofiaHoliday;
        double extraGames = allGamesHoliday * 0.15;
        double result = allGamesHoliday + extraGames;

        if (year.equals("leap")){
            System.out.println(Math.floor(result));
        } else {
            System.out.println(Math.floor(allGamesHoliday));
        }
    }
}
