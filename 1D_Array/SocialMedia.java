import java.util.ArrayList;
import java.util.Scanner;
class SocialMedia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> engagement = new ArrayList<>();
        for(int i = 0; i < n; i++){
            engagement.add(sc.nextDouble());
        }
        double totalEngagement = 0;
        double maxEngagement = Double.MIN_VALUE;
        double minEngagement = Double.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;

        for(int i = 0; i < engagement.size(); i++){
            double val = engagement.get(i);
            totalEngagement += val;
            if(val > maxEngagement){
                maxEngagement = val;
                maxIndex = i + 1; 
            }
            if(val < minEngagement){
                minEngagement = val;
                minIndex = i + 1;
            }
        }
        double avgEngagement = totalEngagement / n;
        double viralThreshold = avgEngagement * 2.0;
        int viralCount = 0;
        ArrayList<Integer> topPerformers = new ArrayList<>();
        for(int i = 0; i < engagement.size(); i++) {
            if(engagement.get(i) > viralThreshold){
                viralCount++;
                topPerformers.add(i + 1); 
            }
        }
        System.out.println("Total Posts: " + n);
        System.out.printf("Average Engagement: %.2f%%%n", avgEngagement);
        System.out.printf("Peak Engagement: %.2f%% (Post %d)%n", maxEngagement, maxIndex);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)%n", minEngagement, minIndex);
        System.out.println("Viral Posts (>200% avg): " + viralCount);
        System.out.printf("Viral Threshold: %.2f%%%n", viralThreshold);
        System.out.println("Top Performers: " + topPerformers);
    }
}