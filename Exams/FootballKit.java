import java.util.Scanner;

public class FootballKit {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double priceOfTshirts = Double.parseDouble(scanner.nextLine());
        double priceToWinTheBall = Double.parseDouble(scanner.nextLine());

        double priceOfShorts = priceOfTshirts * 0.75;
        double priceOfSocks = priceOfShorts * 0.2;
        double priceOfFootballShoes = (priceOfTshirts + priceOfShorts) * 2;
        double allSum = priceOfTshirts + priceOfShorts + priceOfSocks + priceOfFootballShoes;
        double sumAfterDiscount = allSum - ((allSum * 15) / 100);

        if (sumAfterDiscount >= priceToWinTheBall){

            System.out.printf("Yes, he will earn the world-cup replica ball!%nHis sum is %.2f lv.", sumAfterDiscount);

        }else{
            System.out.printf("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.", (priceToWinTheBall - sumAfterDiscount));
        }

    }

}
