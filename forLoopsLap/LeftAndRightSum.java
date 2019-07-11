import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        int leftSize = 0;
        int rightSize = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            leftSize += num;

        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            rightSize += num;

        }

        int diff = Math.abs(rightSize - leftSize);

        if (diff == 0){
            System.out.printf("Yes, sum = %d", leftSize);
        } else {
            System.out.printf("No, diff = %d", diff);
        }

    }
}
