import java.util.Scanner;
class Table{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        for(int i = 1; i<=col;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j = 1;j<=row;j++){
            System.out.print(j+" ");
            for(int i = 1; i<=col;i++){
                System.out.printf((j*i)+ " ");
            }
            System.out.println();
        }    
        
    }
}
