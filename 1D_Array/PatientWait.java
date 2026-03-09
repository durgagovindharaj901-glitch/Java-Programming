import java.util.Scanner;
class PatientWait{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] waitTime = new int[n];
        int max = 0;
        double sum = 0;
        for(int i = 0; i<n;i++){
            waitTime[i] = scan.nextInt();
            if(waitTime[i] > max){
                max = waitTime[i];
            }
            sum = sum + waitTime[i];
        }
        double average = sum / n;
        int count = 0;
        
        for(int i = 0; i<n ;i++){
            if(waitTime[i] > 60){
                count++;
            }
        }

        double seriveLevel = ((double)(n-count)/n)*100;
        System.out.println("Total Patients: "+n);
        System.out.println("Longest Wait Time: "+max);
        System.out.println("Average Wait Time: "+average+"0");
        System.out.println("Patient Waiting >60min: "+count);
        System.out.println("Service Level: "+seriveLevel+"0%");
    }
}