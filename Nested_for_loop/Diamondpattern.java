import java.util.Scanner;
class Diamondpattern{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for(int i = 0;i<=size;i+=2){
            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }    
        for(int k = size-2 ; k>=1;k -= 2){
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
        
    }
}