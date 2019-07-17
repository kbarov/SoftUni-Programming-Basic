import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 0;
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (num > maxNum) {
                maxNum = num;
            }

        }

        if (sum - maxNum == maxNum) {
            System.out.printf("Yes sum = %d", sum - maxNum);
        } else {
            System.out.printf("No diff = %d", Math.abs(maxNum - (sum - maxNum)));
        }
    }
}
