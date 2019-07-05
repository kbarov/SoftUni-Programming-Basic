import java.util.Scanner;

public class Journey {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double discount = 0;


        if (budget <= 100){
            System.out.println("Somewhere in Bulgaria");
        } else if (budget <= 1000){
            System.out.println("Somewhere in Balkans");
        } else if (budget > 1000){
            System.out.println("Somewhere in Europe");
        }

        switch (season){
            case "summer":
                if (budget <= 100){
                    discount = budget * 0.30;
                } else if (budget <= 1000){
                    discount = budget * 0.40;
                } else if (budget > 1000){
                    discount = budget * 0.90;
                }
                break;
            case "winter":
                if (budget <= 100){
                    discount = budget * 0.70;
                } else if (budget <= 1000){
                    discount = budget * 0.80;
                } else if (budget > 1000){
                    discount = budget * 0.90;
                }
                break;
        }



        if (season.equals("summer") && (budget > 1000)){
            System.out.printf("Hotel - %.2f",discount);
        } else if (season.equals("winter")){
            System.out.printf("Hotel - %.2f",discount);
        } else if (season.equals("summer")){
            System.out.printf("Camp - %.2f",discount);
        }





    }
}
