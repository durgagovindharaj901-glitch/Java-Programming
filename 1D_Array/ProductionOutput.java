import java.util.Scanner;
class ProductionOutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] outputs = new int[n];

        for(int i = 0; i < n; i++){
            outputs[i] = sc.nextInt();
        }
        int totalOutput = 0;
        int maxOutput = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < n; i++){
            int val = outputs[i];
            totalOutput += val;
            if(val > maxOutput){
                maxOutput = val;
                maxIndex = i + 1; 
            }
        }
        double avgOutput = (double) totalOutput / n;
        double threshold = avgOutput * 0.9;
        int underperformingCount = 0;
        
        for(int i = 0; i < n; i++){
            if(outputs[i] < threshold){
                underperformingCount++;
                priorityLines.append(i + 1).append(", ");
            }
        }
        if(underperformingCount > 0){
            priorityLines.setLength(priorityLines.length() - 2);
        }else{
            priorityLines = new StringBuilder("[]");
        }
        System.out.println("Production Lines: " + n);
        System.out.println("Total Output: " + totalOutput + " units");
        System.out.printf("Average Output: %.2f units/hour%n", avgOutput);
        System.out.println("Top Producer: Line " + maxIndex + " (" + maxOutput + " units)");
        System.out.println("Underperforming Lines: " + underperformingCount);
        System.out.printf("Performance Threshold: %.2f units%n", threshold);
        System.out.println("Priority Lines: " + priorityLines.toString());
    }
}