import java.util.Scanner;
class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] temp = new double[n];
        for(int i = 0; i < n; i++){
            temp[i] = sc.nextDouble();
        }
        double max = temp[0];
        double min = temp[0];
        double sum = 0;

        for(int i = 0; i < n; i++){
            if(temp[i] > max){
                max = temp[i];
            }
            if(temp[i] < min){
                min = temp[i];
            }
            sum += temp[i];
        }

        double range = max - min;
        double avg = sum / n;
        System.out.printf("Total Readings: %d%n", n);
        System.out.printf("Maximum Temperature: %.2f%n", max);
        System.out.printf("Minimum Temperature: %.2f%n", min);
        System.out.printf("Temperature Range: %.2f%n", range);
        System.out.printf("Average Temperature: %.2f%n", avg);
    }
}