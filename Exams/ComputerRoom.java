import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mount = scanner.nextLine();
        int numOfhours = Integer.parseInt(scanner.nextLine());
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        String timeOfday = scanner.nextLine();

        double pricePerHour = 0;
        double allPrice = 0;



        switch (mount){
            case "march":
                if (timeOfday.equals("day")){
                    pricePerHour = 10.5;
                } else if (timeOfday.equals("night")){
                    pricePerHour = 8.4;
                }
                if (numOfPeople >= 4){
                    pricePerHour = pricePerHour - (pricePerHour * 0.1);
                }
                if (numOfhours >= 5){
                    pricePerHour = pricePerHour - (pricePerHour * 0.5);
                }
            case "april":
                if (timeOfday.equals("day")){
                    pricePerHour = 10.5;
                } else if (timeOfday.equals("night")){
                    pricePerHour = 8.4;
                }
                if (numOfPeople >= 4){
                    pricePerHour = pricePerHour - (pricePerHour * 0.1);
                }
                if (numOfhours >= 5){
                    pricePerHour = pricePerHour - (pricePerHour * 0.5);
                }
            case "may":
                if (timeOfday.equals("day")){
                    pricePerHour = 10.5;
                } else if (timeOfday.equals("night")){
                    pricePerHour = 8.4;
                }
                if (numOfPeople >= 4){
                    pricePerHour = pricePerHour - (pricePerHour * 0.1);
                }
                if (numOfhours >= 5){
                    pricePerHour = pricePerHour - (pricePerHour * 0.5);
                }
                break;
            case "june":
                if (timeOfday.equals("day")){
                    pricePerHour = 12.6;
                } else if (timeOfday.equals("night")){
                    pricePerHour = 10.2;
                }
                if (numOfPeople >= 4){
                    pricePerHour = pricePerHour - (pricePerHour * 0.1);
                }
                if (numOfhours >= 5){
                    pricePerHour = pricePerHour - (pricePerHour * 0.5);
                }
            case "july":
                if (timeOfday.equals("day")){
                    pricePerHour = 12.6;
                } else if (timeOfday.equals("night")){
                    pricePerHour = 10.2;
                }
                if (numOfPeople >= 4){
                    pricePerHour = pricePerHour - (pricePerHour * 0.1);
                }
                if (numOfhours >= 5){
                    pricePerHour = pricePerHour - (pricePerHour * 0.5);
                }
            case "august":
                if (timeOfday.equals("day")){
                    pricePerHour = 12.6;
                } else if (timeOfday.equals("night")){
                    pricePerHour = 10.2;
                }
                if (numOfPeople >= 4){
                    pricePerHour = pricePerHour - (pricePerHour * 0.1);
                }
                if (numOfhours >= 5){
                    pricePerHour = pricePerHour - (pricePerHour * 0.5);
                }
                break;
        }

        allPrice = (pricePerHour * numOfhours) * numOfPeople;
        System.out.printf("Price per person for one hour: %.2f\n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f", allPrice);
    }
}




























//        if (mount.equals("march") || (mount.equals("april") || (mount.equals("may")))){
//            if (timeOfday.equals("day")){
//                pricePerDay = 10.5;
//                price = pricePerDay * numOfhours * numOfPeople;
//            } else if (timeOfday.equals("night")){
//                pricePerDay = 8.4;
//                price = pricePerDay * numOfhours * numOfPeople;
//            }
//        } else if (mount.equals("june") || (mount.equals("july") || (mount.equals("august")))){
//            if (timeOfday.equals("day")){
//                if (numOfPeople >= 4){
//                    price = pricePerDay * 0.1;
//                }
//                if (numOfhours >= 5){
//                    price = numOfhours * 0.50;
//                }
//                pricePerDay = 12.6;
//                price = pricePerDay * numOfhours * numOfPeople;
//            } else if (timeOfday.equals("night")){
//                pricePerDay = 10.2;
//                price = pricePerDay * numOfhours * numOfPeople;
//                if (numOfPeople >= 4){
//                    pricePerDay = numOfPeople * 0.1;
//                }
//                if (numOfhours >= 5){
//                    pricePerDay = pricePerDay -(pricePerDay * 0.50);
//                }
//
//            }
//        }
//
//
//        System.out.printf("Price per person for one hour: %.2f%n", pricePerDay);
//        System.out.printf("Total cost of the visit: %.2f", price);
//    }
//}
