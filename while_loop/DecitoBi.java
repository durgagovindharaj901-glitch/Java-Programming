import java.util.Scanner;
class DecitoBi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int decimal = sc.nextInt();
            int temp = decimal;

            String binary = "";
            
            if(decimal==0){
                binary = "0";
            }
            while(decimal > 0){
                int rem = decimal % 2;
                binary = rem + binary;
                decimal = decimal / 2;            
            }
            System.out.println("Decimal: "+decimal);
            System.out.println("Binary: "+binary);
    }
}
