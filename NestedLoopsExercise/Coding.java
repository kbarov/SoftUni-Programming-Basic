import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String num = Integer.toString(n);
        int lastNum = n;

        for (int i = 0; i < num.length(); i++) {
            int number = lastNum % 10;
            int lastDigit = (lastNum - number) / 10;
            lastNum = lastDigit;

            if (number == 0) {
                System.out.print("ZERO");
            }

            for (int j = 0; j < number; j++) {
                int ascii = number + 33;
                char symbol = (char) ascii;
                System.out.print(symbol);

            }
            System.out.println();
        }
    }
}