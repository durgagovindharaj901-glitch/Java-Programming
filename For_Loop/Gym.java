import java.util.Scanner;
class Gym{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int N = scan.nextInt();
        scan.nextLine();

        double totalRevenue = 0;
        int urgentCount = 0;

        for(int i = 0; i < N;i++){
            scan.nextLine();
            String memberName = scan.nextLine();
            String membershipType = scan.nextLine();
            int daysUntilExpiry = scan.nextInt();

            double fee = 0;
            switch(membershipType){
                case "Basic" : fee = 50;
                               break;
                case "Premium" : fee = 100;
                                break;
                case "VIP" : fee = 200;
                            break;
            }
            int discount = 0;
            if(daysUntilExpiry >= 45){
                discount = 20;
            }else if(daysUntilExpiry >= 30){
                discount = 15;
            }else if(daysUntilExpiry >= 15){
                discount = 10;
            }
            String priority;
            if(daysUntilExpiry < 10){
                priority = "Urgent";
                urgentCount++;
            }else if(daysUntilExpiry <= 30){
                priority = "High";
            }else{
                priority = "Normal";
            }
            double finalFee = fee * (1-discount);
            totalRevenue += finalFee;

            System.out.println("Member:"+memberName);
            System.out.print("Membershi(Basic/Premium/VIP):"+membershipType);
            System.out.print("Days Until Expiry:"+daysUntilExpiry);
            System.out.println("Renewal Fee: $"+fee);
            System.out.println("Discount:"+discount + "%");
            System.out.println("Final Fee:$"+finalFee);
            System.out.println("Priority:"+priority);
        

        }
        
        double average = (N > 0)?totalRevenue / N : 0;

        
        System.out.println("Total Members:"+N);
        System.out.println("urgent Renewals:"+urgentCount);
        System.out.println("Total Renewal Revenue:$"+totalRevenue);
        System.out.println("Average Renewal Fee:$"+average);
    }
}