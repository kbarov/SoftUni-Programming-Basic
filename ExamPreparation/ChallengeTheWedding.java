import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMans = Integer.parseInt(scanner.nextLine());
        int countLadies = Integer.parseInt(scanner.nextLine());
        int maxTable = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countMans; i++) {
            for (int j = 1; j <= countLadies; j++) {

                if (maxTable <= (i * j)) {
                    break;
                } else if (maxTable >= (i * j)){
                    System.out.print("" + "(" + i + " " + "<->" + " " + j + ")" + " ");
                } else {
                    return;
                }


            }
        }
    }
}