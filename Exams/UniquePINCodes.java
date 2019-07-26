import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= numOne; i += 2) {
            for (int j = 2; j <= numTwo; j++) {
                for (int k = 2; k <= numThree; k += 2) {
                    if ((j >= 2 && j <= 7) && (j != 4 && j != 6)) {
                        System.out.printf("%d %d %d ", i, j, k);
                        System.out.println();
                    }

                }
            }

        }
    }
}


