import java.util.Scanner;
public class Restaurant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double totalBill = sc.nextDouble();
        double service = sc.nextDouble();
        double gst = sc.nextDouble();
        double numberOfPeople = sc.nextDouble();

        double net_service = (totalBill*service)/100;
        double net_gst = (totalBill*gst)/100;
        double total = totalBill + net_service + net_gst;
        System.out.println("Amount per person = "+ total/numberOfPeople);
    }
}