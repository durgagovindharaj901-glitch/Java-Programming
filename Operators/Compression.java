import java.util.Scanner;
public class Compression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fileSize = sc.nextInt();
        int cycles = sc.nextInt();

        int power =1;
        for(int i = 0; i<cycles;i++){
            power = power * 2 ;
        }
        int compress = fileSize / power;
        System.out.println("Compressed Size = "+compress);
    }
}