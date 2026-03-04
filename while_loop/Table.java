import java.util.Scanner;
class Table{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int range = scan.nextInt();
        int i = 1;
        int res = 0;
        do{
            res = num * i;
            
            System.out.printf("%d x %d = %d\n",num,i,res);
            i++;
        }
        while(i<=range);
    }
}
