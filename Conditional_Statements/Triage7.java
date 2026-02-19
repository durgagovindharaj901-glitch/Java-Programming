import java.util.Scanner;
public class Triage7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int heartRate = sc.nextInt();
        sc.nextLine(); 
        String bp = sc.nextLine();
        double temperature = sc.nextDouble();
        sc.nextLine();
        String symptomSeverity = sc.nextLine();

        String[] parts = bp.split("/");
        int systolic = Integer.parseInt(parts[0]);
        int diastolic = Integer.parseInt(parts[1]);

        String triagePriority = "";
        int waitTime = 0;
        String action = "";

        if (heartRate < 50 || heartRate > 130 ||
            systolic > 180 || systolic < 90 ||
            temperature > 103 || temperature < 96 ||
            symptomSeverity.equalsIgnoreCase("Life-Threatening")) {

            triagePriority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";

        } 
        else if ((heartRate >= 50 && heartRate <= 60) ||
                 (heartRate >= 110 && heartRate <= 130) ||
                 (systolic >= 160 && systolic <= 180) ||
                 (systolic >= 90 && systolic <= 100) ||
                 (temperature >= 101 && temperature <= 103) ||
                 (temperature >= 96 && temperature <= 97) ||
                 symptomSeverity.equalsIgnoreCase("Severe")) {

            triagePriority = "Urgent";

            if (heartRate < 60 || systolic < 100 || temperature < 97) {
                waitTime = 20;
            } else {
                waitTime = 15;
            }

            action = "Priority Medical Attention";
        }
        else if (symptomSeverity.equalsIgnoreCase("Moderate")) {
            triagePriority = "Standard";
            waitTime = 45;
            action = "Standard Examination";
        }
        else {
            triagePriority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Check-up";
        }

        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + symptomSeverity);
        System.out.println("Triage Priority: " + triagePriority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);
    }
}