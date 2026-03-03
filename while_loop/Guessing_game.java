import java.util.Scanner;
class Guessing_game{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int secretNumber = scan.nextInt();
        int attempts = 0;

        while(true){
            int guess = scan.nextInt();
            attempts++;
            System.out.println("Guess the number(1100):"+guess);

            if(guess > secretNumber){
                System.out.println("Too high!");
            }
            else if(guess < secretNumber){
                System.out.println("Too low!");
            }else{
                System.out.println("Correct! Attempts : "+attempts);
                break;
            }


            
        }
    }
}