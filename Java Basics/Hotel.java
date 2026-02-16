import java.util.Scanner;
public class Hotel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int roomsBooked = sc.nextInt();
        int priceperRoom = sc.nextInt();
        int serviceCharges = sc.nextInt();
        int commission = sc.nextInt();

        int room = (roomsBooked * priceperRoom) + serviceCharges - commission;
        System.out.println("Total Revenue = "+room);
    }
}