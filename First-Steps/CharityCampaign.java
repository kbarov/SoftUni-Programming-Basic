import java.util.Scanner;

public class CharityCampaign {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double sumDays = Double.parseDouble(scanner.nextLine());
        double sumConfectioner = Double.parseDouble(scanner.nextLine());
        double sumCakes = Double.parseDouble(scanner.nextLine());
        double sumWaffles = Double.parseDouble(scanner.nextLine());
        double sumPancakes = Double.parseDouble(scanner.nextLine());

        double cakes = sumCakes * 45;
        double waffles = sumWaffles * 5.80;
        double pancakes = sumPancakes * 3.20;
        double sumOneDay = (cakes + waffles + pancakes) * sumConfectioner;
        double sumAllCompany = sumOneDay * sumDays;
        double sumAfterExpеnses = sumAllCompany - (sumAllCompany / 8);


        System.out.printf("%.2f", sumAfterExpеnses);

    }
}
