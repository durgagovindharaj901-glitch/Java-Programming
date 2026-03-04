import java.util.Scanner;
class Strong{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int sum =0;
        int temp = n;
        while(n>0){
            int digit = n%10;
            int fact = 1;

            for(int i = 1; i<=digit;i++){
                fact = fact *i;
            }
            sum = sum+fact;
            n=n/10;
        }
        
        if(sum == temp){
            System.out.println(temp+" is a strong number");
        }else{
            System.out.println(temp+" is not a strong number");
        }
        
    }
}