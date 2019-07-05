import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        int HourIzpit = Integer.parseInt(scanner.nextLine());
        int MinIzpit = Integer.parseInt(scanner.nextLine());
        int HourPrist = Integer.parseInt(scanner.nextLine());
        int MinPrist = Integer.parseInt(scanner.nextLine());
        int ObMinIzpit = HourIzpit * 60 + MinIzpit;
        int ObMinPrist = HourPrist * 60 + MinPrist;
        if (ObMinIzpit==ObMinPrist || (ObMinIzpit>ObMinPrist && ObMinIzpit-ObMinPrist<=30))
        {
            System.out.println("On time");
        }
        if (ObMinIzpit > ObMinPrist && ObMinIzpit - ObMinPrist >30)
        {
            System.out.println("Early");
        }
        if (ObMinPrist>ObMinIzpit)
        {
            System.out.println("Late");
        }
        if (Math.abs(ObMinPrist-ObMinIzpit)!=0)
        {
            int hours = Math.abs(ObMinPrist - ObMinIzpit) / 60;
            int mins = Math.abs(ObMinPrist - ObMinIzpit) % 60;
            if (hours >=1)
            {
                if (mins < 10) System.out.print(hours + ":0" + mins + " hours");
                else System.out.print(hours + ":" + mins + " hours");
            }
            else System.out.print(mins + " minutes");
            if ((ObMinPrist - ObMinIzpit) < 0)
                System.out.println(" before the start");
            else
                System.out.println(" after the start");
        }
    }
}