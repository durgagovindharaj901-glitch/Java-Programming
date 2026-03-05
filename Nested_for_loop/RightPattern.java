import java.util.Scanner;
class RightPattern{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        scan.nextLine();
        String ch = scan.next();
        for(int i = 0; i<=height;i++){
            for(int j= 1;j<=i;j++){
                if(ch.equals("number")){
                    System.out.printf("%d",j);
                }else if(ch.equals("star")){
                    System.out.printf("*",j);
                }
            }
            System.out.println();
        }
        
    }
}