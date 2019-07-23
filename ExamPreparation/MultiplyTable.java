import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int num1 = number / 100;
        int num2 = (number % 100) / 10;
        int num3 = number % 10;


        for (int i = 1; i <= num3 ; i++) {
            for (int j = 1; j <= num2; j++) {
                for (int k = 1; k <= num1; k++) {
                    int sum = i * j * k;
                    System.out.printf("%d * %d * %d = %d;\n", i , j , k, sum);
                }
            }
        }


    }
}
