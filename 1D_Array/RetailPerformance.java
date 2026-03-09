import java.util.Scanner;
class RetailPerformance{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] sales = new double[n];
        double sum = 0;
        double max = sales[0];
        double min = sales[0];
        for(int i = 0; i< n;i++){
            sales[i] = scan.nextDouble();
            sum = sum + sales[i];
            if(sales[i] > max){
                max = sales[i];
            }
            if(sales[i] < min){
                min = sales[i];
            }
        }
        double average = sum / n;
        System.out.println("Total Stores: "+n);
        System.out.println("Highest Sales: $"+max);
        System.out.println("Lowest Sales: $"+min);
        System.out.println("Total Sales: $"+sum);
        System.out.println("Average Sales: $"+average);
    }
}