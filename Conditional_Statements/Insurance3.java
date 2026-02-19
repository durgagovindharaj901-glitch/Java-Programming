import java.util.Scanner;
public class Insurance3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        String status = sc.nextLine();
        String preExisting = sc.nextLine();
        String tier = sc.nextLine();
        int base_premium = 0;
        int surcharge = 0;
        if(age >= 18 && age <= 100) {
            if(age <= 30) {
                base_premium = 100;
            }else {
                if(age <= 45) {
                    base_premium = 150;
                }else {
                    if(age <= 60) {
                        base_premium = 200;
                    }else{
                        base_premium = 300;
                    }
                }
            }
        }else{
            System.out.println("Invalid age");
        }
        if(tier.equalsIgnoreCase("Basic")) {
            base_premium += 0;
        }else{
            if(tier.equalsIgnoreCase("Standard")) {
                base_premium += 50;
            }else{
                if(tier.equalsIgnoreCase("Premium")) {
                    base_premium += 100;
                }else{
                    System.out.println("Invalid coverage tier");
                }
            }
        }
        if(status.equalsIgnoreCase("Smoker")) {
            surcharge += 75;
        }else{
            if (status.equalsIgnoreCase("Non-Smoker")) {
                surcharge += 0;
            }else{
                System.out.println("Invalid smoking status");
                
            }
        }

        if(preExisting.equalsIgnoreCase("Yes")) {
            surcharge += 50;
        }else{
            if(preExisting.equalsIgnoreCase("No")) {
                surcharge += 0;
            }else{
                System.out.println("Invalid pre-existing condition input");
            }
        }
        int total = base_premium + surcharge;
        System.out.println("Age:"+age);
        System.out.println("Smoking Status:"+status);
        System.out.println("Pre-existing Conditions:"+preExisting);
        System.out.println("Coverage Tier:"+tier);
        System.out.println("Base Premium:"+ base_premium);
        System.out.println("Risk Surcharge:"+ surcharge);
        System.out.println("Total Monthly Premium:"+total);
    }
}