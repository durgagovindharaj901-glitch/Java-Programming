import java.util.Scanner;
import java.util.ArrayList;
class QualityControl{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int maxDefects = scan.nextInt();
        int[] defcnt = new int[n];
        for(int i = 0; i<n;i++){
            defcnt[i] = scan.nextInt();
        }
        int count=0;
        ArrayList<Integer> criticLine = new ArrayList<>();

        for(int i =0;i<n;i++){
            if(defcnt[i] > maxDefects){
                count++;
                criticLine.add(i+1);
            }
        }
        double rate = ((double)(n-count)/n)*100;
        System.out.println("Production Lines: "+n);
        System.out.println("Acceptable Threshold: "+maxDefects);
        System.out.println("Line Exceeding Threshold: "+count);
        System.out.println("Critical Lines: "+criticLine);
        System.out.println("Compliance Rate: "+rate+"0%");
        
    }
}