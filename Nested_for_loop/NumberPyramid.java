import java.util.Scanner;
class NumberPyramid{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        for(int row =1;row <= height;row++){
            for(int j= 1;j<=row;j++){
                System.out.print(j);
            }
            for(int j=row-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}