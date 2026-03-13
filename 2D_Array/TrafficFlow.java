import java.util.Scanner;
class TrafficFlow{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lanes = scan.nextInt();
        int hours = scan.nextInt();
        int[][] traffic = new int[lanes][hours];
        for(int j =0;j<hours;j++){
            for(int i = 0; i< lanes;i++){
                traffic[i][j] = scan.nextInt();
            }
        }
        System.out.println("Traffic Data: ");
        for(int i = 0; i< lanes;i++){
            for(int j =0;j<hours;j++){
                System.out.print(traffic[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total Traffic per Lane:");
        for(int i = 0;i<lanes;i++){
            int total = 0;
            for(int j = 0;j<hours;j++){
                total += traffic[i][j];
            }
            System.out.println("Lane " +  (i+1) + ": "+total);
        }

        int[] hourTotal = new int[hours];
        for(int j = 0; j<hours;j++){
            int sum = 0;
            for(int i = 0;i<lanes;i++){
                sum += traffic[i][j];
            }
            hourTotal[j] = sum;
        }
        int maxTraffic = hourTotal[0];
        int busyHour = 1;
        for(int j = 1;j<hours;j++){
            if(hourTotal[j] > maxTraffic){
                busyHour = j+ 1;
            }
        }
        System.out.println("Busiest Hour: Hour " + busyHour+"with" + maxTraffic +"vehicles");
    }
}