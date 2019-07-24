import java.util.Scanner;

public class WeddingInvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dogovor = scanner.nextLine();
        String tipDogovor = scanner.nextLine();
        String desert = scanner.nextLine();
        int mount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (dogovor){
            case "one":
                switch (tipDogovor){
                    case "Small":
                        price = 9.98;
                        if (desert.equals("yes")){
                            price += 5.50;
                        }
                        break;
                    case "Middle":
                        price = 18.99;
                        if (desert.equals("yes")){
                            price += 4.35;
                        }
                        break;
                    case "Large":
                        price = 25.98;
                        if (desert.equals("yes")){
                            price += 4.35;
                        }
                        break;
                    case "ExtraLarge":
                        price = 35.99;
                        if (desert.equals("yes")){
                            price += 3.85;
                        }
                        break;
                }
                break;
            case "two":
                switch (tipDogovor){
                    case "Small":
                        price = 8.58;
                        if (desert.equals("yes")){
                            price += 5.50;
                        }
                        break;
                    case "Middle":
                        price = 17.09;
                        if (desert.equals("yes")){
                            price += 4.35;
                        }
                        break;
                    case "Large":
                        price = 23.59;
                        if (desert.equals("yes")){
                            price += 4.35;
                        }
                        break;
                    case "ExtraLarge":
                        price = 31.79;
                        if (desert.equals("yes")){
                            price += 3.85;
                        }
                        break;
                }
                break;

        }


        double allSum = price * mount;
        double allSumDiscount = allSum * 3.75 / 100;
        double finalSumDiscount = allSum - allSumDiscount;
        if (dogovor.equals("two")){
            System.out.printf("%.2f lv.", finalSumDiscount);
        } else {
            System.out.printf("%.2f lv.", allSum);
        }




    }
}
