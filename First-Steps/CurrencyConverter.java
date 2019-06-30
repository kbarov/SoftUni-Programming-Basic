import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());
        String inputCurr = scanner.nextLine();
        String outputCurr = scanner.nextLine();

        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;
        double suma = 0;

        if(inputCurr.equals("BGN")){
            switch (outputCurr) {
                case "USD": suma = value / usd;
                    System.out.printf("%.2f USD",suma);
                    break;
                case "EUR": suma = value / eur;
                    System.out.printf("%.2f EUR",suma);
                    break;
                case "GBP": suma = value / gbp;
                    System.out.printf("%.2f GBP",suma);
                    break;
            }
        }
        if(inputCurr.equals("USD")){
            switch (outputCurr) {
                case "BGN": suma = value / (1 / usd);
                    System.out.printf("%.2f BGN",suma);
                    break;
                case "EUR": suma = (value / (1 / usd)) / eur;
                    System.out.printf("%.2f EUR",suma);
                    break;
                case "GBP": suma = (value / (1 / usd)) / gbp;
                    System.out.printf("%.2f GBP",suma);
                    break;
            }
        }
        if(inputCurr.equals("EUR")){
            switch (outputCurr) {
                case "BGN":
                    suma = value / (1 / eur);
                    System.out.printf("%.2f BGN", suma);
                    break;
                case "USD":
                    suma = (value / (1 / eur)) / usd;
                    System.out.printf("%.2f USD", suma);
                    break;
                case "GBP":
                    suma = (value / (1 / eur)) / gbp;
                    System.out.printf("%.2f GBP", suma);
                    break;
            }
        }
        if(inputCurr.equals("GBP")){
            switch (outputCurr) {
                case "BGN": suma = value / (1 / gbp);
                    System.out.printf("%.2f BGN",suma);
                    break;
                case "USD": suma = (value / (1 / gbp)) / usd;
                    System.out.printf("%.2f USD",suma);
                    break;
                case "EUR": suma = (value / (1 / gbp)) / eur;
                    System.out.printf("%.2f EUR",suma);
                    break;
            }
        }
    }
}