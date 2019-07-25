import java.util.Scanner;

public class ASCI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int digitSum = 0;
        String digits = "";
        int upperLettersSum = 0;
        String upperLetters = "";
        int lowerLettersSum = 0;
        String lowerLetters = "";
        int otherSum = 0;
        String other = "";
        for (int i = 0; i < n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int value = (int)symbol;
            if (value >= 48 && value <= 57) {
                digitSum += value;
                digits += symbol;

            } else if (value >= 65 && value <= 90){
                upperLettersSum += value;
                upperLetters += symbol;

            } else if (value >= 97 && value <= 122){
                lowerLettersSum += value;
                lowerLetters += symbol;

            } else {
                otherSum += value;
                other += symbol;

            }

        }

        int result1 = Math.max(digitSum, upperLettersSum);
        int result2 = Math.max(lowerLettersSum, otherSum);
        int result = Math.max(result1, result2);

        if (digitSum == result){
            System.out.printf("Biggest ASCII sum is: %d\n",result);
            System.out.printf("Combination of character with biggest ASCII sum is: %s", digits);
        } else if (upperLettersSum == result){
            System.out.printf("Biggest ASCII sum is: %d\n",result);
            System.out.printf("Combination of character with biggest ASCII sum is: %s", upperLetters);
        } else if (lowerLettersSum == result) {
            System.out.printf("Biggest ASCII sum is: %d\n", result);
            System.out.printf("Combination of character with biggest ASCII sum is: %s", lowerLetters);
        } else {
            System.out.printf("Biggest ASCII sum is: %d\n", result);
            System.out.printf("Combination of character with biggest ASCII sum is: %s", other);
        }
    }
}
