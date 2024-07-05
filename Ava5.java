import java.util.Scanner;

public class Ava5 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int x = input.nextInt();
     int sum=0;
     while (x>0) {
        int rem=x%10;
        sum = sum*10+rem;
        rem=x/2;
         
     }
           System.out.println(sum);
        
    }
    
}