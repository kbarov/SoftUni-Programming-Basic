import java.util.Scanner;

public class MetricConverter {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String entry = scanner.nextLine();
        String exit = scanner.nextLine();

        if (entry.equals("mm")){
            num = num / 1000;
        }else if (entry.equals("cm")){
            num = num / 100;
        }else if (entry.equals("mi")){
            num = num / 0.000621371192;
        }else if (entry.equals("in")){
            num = num / 39.3700787;
        }else if (entry.equals("km")){
            num = num / 0.001;
        }else if (entry.equals("ft")){
            num = num / 3.2808399;
        }else if (entry.equals("yd")){
            num = num / 1.0936133;
        }

        if (exit.equals("mm")){
            num = num * 1000;
        }else if (exit.equals("cm")){
            num = num * 100;
        }else if (exit.equals("mi")){
            num = num * 0.000621371192;
        }else if (exit.equals("in")){
            num = num * 39.3700787;
        }else if (exit.equals("km")){
            num = num * 0.001;
        }else if (exit.equals("ft")){
            num = num * 3.2808399;
        }else if (exit.equals("yd")){
            num = num * 1.0936133;
        }

        System.out.printf("%.8f", num);


    }
}
