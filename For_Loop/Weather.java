import java.util.Scanner;
class Weather{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        double totalTemp = 0;
        double highTemp = Double.NEGATIVE_INFINITY;
        double lowTemp = Double.POSITIVE_INFINITY;
        int maxHour = -1, minHour = -1;
        int hotHours = 0 , coldHours = 0;

        for(int i = 0; i< N;i++){
            int hour = scan.nextInt();
            double temperature = scan.nextDouble();
            totalTemp += temperature;

            if(temperature > highTemp){
                highTemp = temperature;
                maxHour = i;
            }
            if(temperature < lowTemp){
                lowTemp = temperature;
                minHour = i;
            }

            if(temperature >= 32){
                hotHours++;
            }else if(temperature <= 10){
                coldHours++;
            }
            System.out.println("Hour "+ hour +":" + temperature);
            String status;
            if(temperature > 40 || temperature < 0){
                System.out.println("Status: Extreme");
            }else if(temperature >= 32 && temperature <= 40){
                System.out.println("Status: Hot");
            }else if(temperature >= 0 && temperature <= 10){
                System.out.println("Status: Cold");
            }else if(temperature > 10 && temperature < 32){
                System.out.println("Status: Normal");
            }  
            
        }
        double average = totalTemp /N;

        System.out.println("Total Readings:"+N);
        System.out.println("Average Temperature:"+average);
        System.out.println("Highest Temperature:"+highTemp + " at Hour " + maxHour);
        System.out.println("Lowest Temperature:"+lowTemp + " at Hour " + minHour);
        System.out.println("hot Hours:"+hotHours);
        System.out.println("Cold Hours:"+coldHours);
    }
}