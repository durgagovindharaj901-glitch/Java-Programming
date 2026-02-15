import java.util.Scanner;
public class Grocery{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sales=sc.nextInt();
        int discount = sc.nextInt();
        int gst = sc.nextInt();

        int value1 = (sales*discount)/100;
        int dis = sales-value1;
        int value2 = (dis*gst)/100;
        int Final = dis+value2;
        System.out.println("Final Revenue = "+Final);

    }
}