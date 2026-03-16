import java.util.*;

public class HotelStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = sc.nextInt();
        int[][] hotel = new int[floors][];

        for (int i = 0; i < floors; i++) {
            int rooms = sc.nextInt();
            hotel[i] = new int[rooms];
            for (int j = 0; j < rooms; j++) {
                hotel[i][j] = sc.nextInt();
            }
        }

        System.out.println("Hotel Status:");

        for (int i = 0; i < floors; i++) {
            System.out.print("Floor " + (i + 1) + ": ");
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.print(hotel[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nOccupancy Report:");

        int max = -1;
        int busiestFloor = 0;
        int[] occupied = new int[floors];
        for (int i = 0; i < floors; i++) {
            int count = 0;
            for (int j = 0; j < hotel[i].length; j++) {
                if (hotel[i][j] == 1) {
                    count++;
                }
            }
            occupied[i] = count;
            System.out.println("Floor " + (i + 1) + ": " + count + " occupied");

            if (count > max) {
                max = count;
                busiestFloor = i;
            }
        }

        System.out.println("\nBusiest Floor: Floor " + (busiestFloor + 1) +
                " (" + max + " rooms occupied)");
    }
}