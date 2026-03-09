import java.util.Scanner;
import java.util.ArrayList;

class FraudDetection{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] values = new double[n];
        double sum = 0;
        for(int i =0; i<n;i++){
            values[i] = scan.nextDouble();
            sum = sum+values[i];
        }
        double average = sum / n;
        double threshold = average * 2;

        ArrayList<Integer> indices = new ArrayList<>();
        int count = 0;
        for(int i =0;i<n;i++){
            if(values[i] > threshold){
                count++;
                indices.add(i);
            
            }
        }
        
        System.out.println("Total Transactions: "+n);
        System.out.println("Average Transaction: $"+average+"0");
        System.out.println("Suspicious Transactions: "+count);
        System.out.println("Fraud Alert Indices: "+indices);
    }
}