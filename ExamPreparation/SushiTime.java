import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sushi = scanner.nextLine();
        String restorant = scanner.nextLine();
        int portion = Integer.parseInt(scanner.nextLine());
        String order = scanner.nextLine();

        double price = 0;
        double priceWhithDiscount = 0;

        switch (sushi){
                case "sashimi":
                    if (restorant.equals("Sushi Zone")) {
                        price = 4.99;
                    } else if (restorant.equals("Sushi Time")){
                        price = 5.49;
                    } else if (restorant.equals("Sushi Bar")){
                        price = 5.25;
                    } else if (restorant.equals("Asian Pub")){
                        price = 4.50;
                    } else {
                        System.out.printf("%s is invalid restaurant!", restorant);
                        return;
                    }
                    break;
                case "maki":
                    if (restorant.equals("Sushi Zone")) {
                        price = 5.29;
                    } else if (restorant.equals("Sushi Time")){
                        price = 4.69;
                    } else if (restorant.equals("Sushi Bar")){
                        price = 5.55;
                    } else if (restorant.equals("Asian Pub")){
                        price = 4.80;
                    } else {
                        System.out.printf("%s is invalid restaurant!", restorant);
                        return;
                    }
                    break;
                case "uramaki":
                    if (restorant.equals("Sushi Zone")) {
                        price = 5.99;
                    } else if (restorant.equals("Sushi Time")){
                        price = 4.49;
                    } else if (restorant.equals("Sushi Bar")){
                        price = 6.25;
                    } else if (restorant.equals("Asian Pub")){
                        price = 5.50;
                    } else {
                        System.out.printf("%s is invalid restaurant!", restorant);
                        return;
                    }
                    break;
                case "temaki":
                    if (restorant.equals("Sushi Zone")) {
                        price = 4.29;
                    } else if (restorant.equals("Sushi Time")){
                        price = 5.19;
                    } else if (restorant.equals("Sushi Bar")){
                        price = 4.75;
                    } else if (restorant.equals("Asian Pub")){
                        price = 5.50;
                    } else {
                        System.out.printf("%s is invalid restaurant!", restorant);
                        return;
                    }
                    break;


        }

        price = price * portion;


        if (order.equals("Y")){
            priceWhithDiscount = (price * 0.2);
            price += priceWhithDiscount;
            System.out.printf("Total price: %.0f lv.", Math.ceil(price));
        } else {
            System.out.printf("Total price: %.0f lv.", Math.ceil(price ));
        }




    }
}
