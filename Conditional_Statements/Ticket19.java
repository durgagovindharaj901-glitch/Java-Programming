import java.util.Scanner;
public class Ticket19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String format = sc.nextLine();
        String time = sc.nextLine();
        String seat = sc.nextLine();
        String customer = sc.nextLine();

        double basePrice = 12;
        double formatFee = 0, seatFee = 0;
        int timeAdj = 0, custDisc = 0;
        String voucher = "No";
        String category = "Standard";

        if (format.equals("3D")){
            formatFee = 5;
        }else if (format.equals("IMAX")){
            formatFee = 8;
        }else if (format.equals("4DX")){
            formatFee = 10;
        }
        if (seat.equals("Premium")){
            seatFee = 4;
        }else if (seat.equals("Recliner")){
            seatFee = 7;
        }
        if (time.equals("Matinee")){
            timeAdj = -30;
        }else if (time.equals("Prime-Time")){
            timeAdj = 20;
        }else if (time.equals("Late-Night")){
            timeAdj = -20;
        }
        if (customer.equals("Senior")){
            custDisc = 25;
        }else if (customer.equals("Student")){
            custDisc = 15;
        }else if (customer.equals("Child")) custDisc = 30;

        if (time.equals("Matinee") || !customer.equals("Adult"))
            voucher = "Yes";

        double price = basePrice + formatFee + seatFee;
        double adjusted = price * (1 + timeAdj/100.0);
        double finalPrice = adjusted * (1 - custDisc/100.0);

        if (finalPrice < 10) category = "Value";
        else if (finalPrice >= 25) category = "Luxury";
        else if (finalPrice >= 18) category = "Premium";

        System.out.println("Movie Format: " + format);
        System.out.println("Show Time: " + time);
        System.out.println("Seat Category: " + seat);
        System.out.println("Customer Type: " + customer);
        System.out.println("Base Ticket Price: " + basePrice);
        System.out.println("Format Surcharge: " + formatFee);
        System.out.println("Seat Upgrade Fee: " + seatFee);
        System.out.println("Time-Based Adjustment: " + timeAdj + "%");
        System.out.println("Customer Discount: " + custDisc + "%");
        System.out.println("Final Ticket Price: " + finalPrice);
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + category);
    }
}
    