import java.util.Scanner;

public class HotelRoom {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String mount = scanner.nextLine();
        double numOfNights = Double.parseDouble(scanner.nextLine());

        double priceApartment = 0;
        double studio = 0;

        switch (mount){
            case "May":
            case "October":
                priceApartment = 65;
                studio = 50;

                if (numOfNights > 7 && numOfNights < 14){
                    studio = (studio - (studio * 0.05)) * numOfNights;
                } else if (numOfNights > 14){
                    studio = (studio - (studio * 0.30)) * numOfNights;
                } else {
                    studio = studio * numOfNights;
                }
                if (numOfNights > 14){
                    priceApartment = (priceApartment - (priceApartment * 0.10)) * numOfNights;
                } else {
                    priceApartment = priceApartment * numOfNights;
                }
                break;
            case "June":
            case "September":
                priceApartment = 68.70;
                studio = 75.20;
                if (numOfNights > 14){
                    studio = (studio - (studio * 0.20)) * numOfNights;
                } else {
                    studio = studio * numOfNights;
                }
                if (numOfNights > 14){
                    priceApartment = (priceApartment - (priceApartment * 0.10)) * numOfNights;
                } else {
                     priceApartment = priceApartment * numOfNights;
                }
                break;
            case "July":
            case "August":
                priceApartment = 77;
                studio = 76;
                if (numOfNights > 14){
                    priceApartment = (priceApartment - (priceApartment * 0.10)) * numOfNights;
                } else {
                    priceApartment = priceApartment * numOfNights;
                }
                if (numOfNights > 14){
                    studio = studio * numOfNights;
                } else {
                    studio = studio * numOfNights;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", priceApartment, studio);

    }
}
