import java.util.Scanner;
class Sum_even{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int sum = 0;
        do{
            if(start%2==0){
                sum += start;
            }
            start++;
        }
        while(start<=end);
        System.out.printf("Sum of even numbers from %d to %d: %d",start,end,sum);
    }
}