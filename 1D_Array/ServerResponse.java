import java.util.Scanner;
class ServerResponse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] response = new int[n];

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int sum = 0;
        int count =0 ;
        for(int i = 0; i < n;i++){
            response[i] = scan.nextInt();
            int time = response[i];
            if(time < min){
                min = time;
            }
            if(time > max){
                max = time;
            }
            sum = sum + response[i];
            if(time > 200){
                count++;
            }
        }
        double average = (double) sum / n;
        double score = ((double)(n - count)/n)*100;

        System.out.println("Total Servers: "+n);
        System.out.println("Fastest Response: "+max+"ms");
        System.out.println("Slowest Response: "+min+"ms");
        System.out.println("Average Response: "+average+"0ms");
        System.out.println("Slow Servers (>200ms): "+count);
        System.out.println("Performance Score: "+score+"0%");

    }
}