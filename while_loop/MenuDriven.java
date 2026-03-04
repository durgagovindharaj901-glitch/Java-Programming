import java.util.Scanner;
class MenuDriven{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice ;
        int res = 0;
        do{
            System.out.println("Calculator Menu");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");

            choice = scan.nextInt();
            if(choice >= 1 && choice <= 4){
                System.out.println("Choice :"+choice);
                System.out.print("Enter two numbers: ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                switch(choice){
                    case 1:
                        res = a + b;
                        System.out.println("Result : "+res);
                        break;
                    case 2 :
                        res = a - b;
                        System.out.println("Result : "+res);
                        break;
                    case 3 :
                        res = a * b;
                        System.out.println("Result : "+res);
                        break;
                    case 4 :
                        res = a / b;
                        System.out.println("Result : "+res);
                        break;
                }
            }
            else if(choice == 5){
                System.out.println("Choice: "+choice);
                System.out.println("Goodbye!");
            }
        }
        while(choice != 5);
    }
}
