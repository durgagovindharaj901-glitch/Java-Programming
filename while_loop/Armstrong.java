import java.util.Scanner;
class Armstrong{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int original = n;
        int count = 0;
        int tempCount = n;
        if(n==0){
            count = 1;
        }else{
            while(tempCount!=0){
                tempCount = tempCount / 10;
                count++;
            }
        }
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            int res = 1;
            int i = 0;
            while(i<count){
                res = res * rem;
                i++;
            }
            sum = sum+res;
            n=n/10;
        }
        if(sum == original){
            System.out.println(original+" is an Armstrong number");
        }else{
            System.out.println(original+" is not an Armstrong number");
        }
    }
}