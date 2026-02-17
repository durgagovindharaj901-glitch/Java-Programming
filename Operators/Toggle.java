import java.util.Scanner;
public class Toggle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int signalValue = sc.nextInt();
        int toggleMask = sc.nextInt();

        int toggledSignal = signalValue ^ toggleMask;
        System.out.println("Toggled Signal = " + toggledSignal);
    }
}
