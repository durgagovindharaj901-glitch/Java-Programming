import java.util.Scanner;
class Vowel_count{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        int i = 0;
        int count  = 0;
        do{
            char ch = text.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||
            ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){
                count++;
            }
            i++;
        }
        while(i<text.length());

        System.out.println("Text: "+text);
        System.out.println("Vowel count: "+count);
    }
}