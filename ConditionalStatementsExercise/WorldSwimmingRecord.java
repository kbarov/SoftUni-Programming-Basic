import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double WR = Double.parseDouble(scanner.nextLine());
        double lenghtMeter = Double.parseDouble(scanner.nextLine());
        double timeInSecond = Double.parseDouble(scanner.nextLine());

        double meters = lenghtMeter * timeInSecond;
        double zabavqne = Math.floor(lenghtMeter / 15) * 12.5;
        double allTime = meters + zabavqne;

        if (allTime < WR){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", allTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",allTime - WR);
        }
    }
}
