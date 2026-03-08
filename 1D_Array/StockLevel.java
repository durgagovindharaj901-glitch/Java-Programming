import java.util.Scanner;
import java.util.ArrayList;
class StockLevel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int threshold = sc.nextInt();
        int[] stock = new int[n];
        for(int i = 0; i < n; i++){
            stock[i] = sc.nextInt();
        }
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(stock[i] < threshold){
                indices.add(i);
            }
        }

        System.out.println("Total Products: " + n);
        System.out.println("Minimum Threshold: " + threshold);
        System.out.println("Low Stock Products: " + indices.size());
        System.out.println("Product Indices: " + indices);
    }
}