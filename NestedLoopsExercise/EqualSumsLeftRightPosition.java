import java.util.Scanner;

public class EqualSumsLeftRightPosition  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int currentNumber;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            currentNumber = i;
            int fifthDigit = currentNumber % 10;
            currentNumber = (currentNumber - fifthDigit) / 10;
            int fourthDigit = currentNumber % 10;
            currentNumber = (currentNumber - fourthDigit) / 10;
            int thirdDigit = currentNumber % 10;
            currentNumber = (currentNumber - thirdDigit) / 10;
            int secondDigit = currentNumber % 10;
            currentNumber = (currentNumber - secondDigit) / 10;
            int firstDigit = currentNumber % 10;
            currentNumber = (currentNumber - firstDigit) / 10;
            leftSum = firstDigit + secondDigit;
            rightSum = fifthDigit + fourthDigit;
            if (leftSum == rightSum) {
                System.out.print(i + " ");
                continue;
            }
            else if (leftSum > rightSum) {
                rightSum = rightSum + thirdDigit;
            }
            else if (rightSum > leftSum) {
                leftSum = leftSum + thirdDigit;
            }

            if (leftSum == rightSum) {
                System.out.print(i + " ");
            }

            leftSum = 0;
            rightSum = 0;
        }

    }
}