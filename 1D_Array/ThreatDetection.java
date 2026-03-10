import java.util.Scanner;
class ThreatDetection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] riskScores = new int[n];

        for(int i = 0; i < n; i++){
            riskScores[i] = sc.nextInt();
        }
        int totalRisk = 0;
        int maxRisk = Integer.MIN_VALUE;
        int minRisk = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;

        for(int i = 0; i < n; i++){
            int score = riskScores[i];
            totalRisk += score;
            if(score > maxRisk){
                maxRisk = score;
                maxIndex = i + 1;
            }
            if(score < minRisk){
                minRisk = score;
                minIndex = i + 1;
            }
        }
        double avgRisk = (double) totalRisk / n;
        double threshold = avgRisk * 2.0;
        int criticalCount = 0;
        StringBuilder alertEvents = new StringBuilder("[");
        for(int i = 0; i < n; i++){
            if(riskScores[i] > threshold){
                criticalCount++;
                alertEvents.append("Event ").append(i + 1).append(" ");
            }
        }
        if(criticalCount > 0){
            alertEvents.append("]");
        }else{
            alertEvents = new StringBuilder("[]");
        }
        System.out.println("Security Events Analyzed: " + n);
        System.out.printf("Average Risk Score: %.2f%n", avgRisk);
        System.out.println("Highest Risk Event: " + maxRisk + " (Event " + maxIndex + ")");
        System.out.println("Lowest Risk Event: " + minRisk + " (Event " + minIndex + ")");
        System.out.println("Critical Threats (>200% avg): " + criticalCount);
        System.out.printf("Threat Threshold: %.2f%n", threshold);
        System.out.println("Alert Events: " + alertEvents.toString());
    }
}