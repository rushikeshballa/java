
import java.util.Scanner;
public class Asme {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int x = input.nextInt();
        if (x % 7 == 0) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
        int y = input.nextInt();

        if (y % 84 == 0) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
        int z = input.nextInt();
        if (96 % z == 0) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
        int a = input.nextInt();
        if (a <= 96) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
        int b = input.nextInt();
         
        if (3/b==0) {
            System.out.println("yes");
            
        }
        else {
            System.out.println("no");
        }
        int c = input.nextInt();
        if (c>=0) {System.out.println("yes");

            
        }
        else{
            System.out.println("no");
        }
        int d = input.nextInt();
        if (d>99) {
            if (d<=999) { System.out.println("yes");
                
            }
            else {
                System.out.println("no");}
            
        }
        
        int e = input.nextInt();
        if (e%2==0) { System.out.println("even");
            
        }
        else{
            System.out.println("odd");
        }
       
        
    }
}