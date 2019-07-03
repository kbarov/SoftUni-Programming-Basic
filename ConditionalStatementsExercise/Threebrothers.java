import java.util.Scanner;

public class Threebrothers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double firstBrotherTime = Double.parseDouble(scanner.nextLine());
        double secondBrotherTime = Double.parseDouble(scanner.nextLine());
        double thirdBrotherTime = Double.parseDouble(scanner.nextLine());
        double fatherTime = Double.parseDouble(scanner.nextLine());

        double allBrothersTime = 1 / (1 / firstBrotherTime + 1 / secondBrotherTime + 1 / thirdBrotherTime);
        double allTime = allBrothersTime + (allBrothersTime * 0.15);

        System.out.printf("Cleaning time: %.2f%n", allTime);

        if (fatherTime > allTime){
            System.out.printf("Yes, there is a surprise - time left -> " + "%.0f hours.", Math.floor(fatherTime - allTime));
        }else {
            System.out.printf("No, there isn't a surprise - shortage of time -> " + "%.0f hours.", Math.ceil(allTime - fatherTime));
        }
    }
}
