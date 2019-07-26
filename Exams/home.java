import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        int

        for (int i = 0; i >= countFloors; i--) {
            for (int j = 0; j >= countRooms; j--) {
                System.out.print("" + i + j + " ");

            }
        }
    }
}
