import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumSinger = Integer.parseInt(scanner.nextLine());
        String result = scanner.nextLine();
        int countGosti = 0;
        int totalSum = 0;

        while (!result.equals("The restaurant is full")){
            int input = Integer.parseInt(result);

            countGosti += input;
            if (input < 5){
                input *= 100;

            } else {
                input *= 70;
            }


            totalSum += input;


            result = scanner.nextLine();
        }
        int diff = Math.abs(totalSum - sumSinger);

        if (totalSum >= sumSinger){
            System.out.printf("You have %d guests and %d leva left.", countGosti , diff);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", countGosti , totalSum);
        }
    }
}
