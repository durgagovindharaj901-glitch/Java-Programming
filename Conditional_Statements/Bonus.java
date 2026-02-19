import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Performance rating :");
        int perform_rating = sc.nextInt();
        System.out.println("Years of Service :");
        int yrsOfService = sc.nextInt();
        System.out.println("Department ? c : C:");
        char department = sc.next().charAt(0);
        System.out.println("Base Salary:");
        float baseSalary = sc.nextFloat();
        float percentage = 0.0f;
        System.out.println("Bonus Percentage :");
        if(perform_rating >= 3){
            if(department == 'c' || department == 'C'){
                if(perform_rating == 5 && yrsOfService >= 5){
                    percentage = 0.25f;
                }else if(perform_rating == 4){
                    if(yrsOfService>=10){
                        percentage = 0.22f;
                    }else{
                        percentage = 0.15f;
                    }
                }else{
                    percentage = 0.12f;
                }
            }else{
                if(perform_rating == 5){
                    percentage = 0.18f;
                }else if(perform_rating == 4){
                    percentage = 0.12f;
                }else{
                    percentage = 0.08f;
                }
            }
            float bonus = baseSalary * percentage;
            System.out.printf("Bonus percentage :%.2f\n",percentage * 100);
            System.out.println("Bonus Amount : "+bonus);
            System.out.println("Status : Eligible");
        }else{
            System.out.println("Status : Not Eligible");
        }
        
    }
}
