import java.util.Scanner;
class Pattern{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        
        do{
            int j = 1;
            while(j<=i){
                System.out.printf("%d ",i);
                j++;
            }
            System.out.println();
            i++;
        }
        while(i<=n);
    }
}