import java.util.Scanner;
public class Food24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();
        String weather = sc.nextLine();

        double baseFee = 3.0;
        double distanceFee = distance * 1.0;

        double peakFee = 0;
        if (timeSlot.equals("Lunch")) peakFee = 2.5;
        else if (timeSlot.equals("Dinner")) peakFee = 2.0;
        else if (timeSlot.equals("Late-Night")) peakFee = 1.5;

        double weatherFee = 0;
        if (weather.equals("Rain")) weatherFee = 2;
        else if (weather.equals("Snow")) weatherFee = 3;
        else if (weather.equals("Storm")) weatherFee = 5;

        double discount = 0;
        if (orderValue >= 75) discount = 5;
        else if (orderValue >= 50) discount = 3;
        else if (orderValue >= 30) discount = 1;

        double finalFee = baseFee + distanceFee + peakFee + weatherFee - discount;
        if (finalFee < 2.99) finalFee = 2.99;

        int time = (int)(distance * 8);

        if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) time += 10;

        if (weather.equals("Rain")) time += 5;
        else if (weather.equals("Snow")) time += 10;
        else if (weather.equals("Storm")) time += 15;

        String priority;
        if (orderValue > 60) priority = "Express";
        else if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) priority = "High";
        else priority = "Standard";

        System.out.println("Delivery Distance: " + distance + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weather);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceFee);
        System.out.println("Peak Time Surcharge: $" + peakFee);
        System.out.println("Weather Surcharge: $" + weatherFee);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + time + " minutes");
        System.out.println("Service Priority: " + priority);
    }
}
   