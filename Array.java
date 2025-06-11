import java.util.Scanner;

public class Array {
           public static void main(String[] args) {
            int[] ar={34,54,40,45,65,39,96,27};
        //     for(int i=0;i<=ar.length-1;i++){
        //        System.out.print(ar[i]+" ");
            
        
        //     }
        // //    Q2
        //    for(int i=1;i<=ar.length-1;i++){
        //     System.out.println(ar[i]);
        //    }
            // //writ in reverse
        //     for(int i=ar.length-1;i>=1;i--){
        //      System.out.println(ar[i]);
        //     }
        //    
        //   //Q3
        // for(int i=0;i<=ar.length-2;i++){
        //     System.out.println(ar[i]);
        // }
        // //Q5
        // for(int i=ar.length-1;i>=0;i--){
        //     System.out.println(ar[i]);
        // }

        // //Q6
        //    
        // for(int i=ar.length-2;i>=0;i--){
        //     System.out.println(ar[i]);
        // }
        // // Q7
        // for(int i=ar.length-1;i>=1;i--){
        //     System.out.println(ar[i]);
        // }

        // // Q8
        // for(int i=ar.length-4;i<=ar.length-1;i++)
        // {
        //     System.out.println(ar[i]);
        // }
        // // Q9
        // int min=ar[0];
        //  for(int i=1;i<=ar.length-1;i++)
        // {
        //     if (min>ar[i]) {
        //         min=ar[i];
                
        //     }
        // }
        // System.out.println(min);

        // // Q10
        // int max=ar[0];
        // for(int i=1;i<=ar.length-1;i++){
        //  if (max<ar[i]) {
        //     max=ar[i];
            
        //  }

        // }
        // System.out.println(max);

        // // Q11
        // int sum=0;
        // for(int i=0;i<=ar.length-1;i++)
        // {
        //     if (sum>=0) {
        //         sum=sum+ar[i];
                
        //     }
        // }
        // System.out.println(sum);

        // //Q12
        // int avg=0;
        // int sum=0;
        // for(int i=0;i<=ar.length-1;i++)
        // {
        //     if (sum>=0) {
        //         sum=sum+ar[i];
        //         avg=sum/ar.length;
        //     }
        // }
        // System.out.println(avg);

        // //Q13
    //    Scanner input=new Scanner(System.in);
    //    int n=input.nextInt();
    //    for(int i=0;i<=ar.length-1;i++){
    //     if (n>=ar[i]) {
    //         System.out.println(ar[i]);
            
    //     }
    //    }
        // //Q14
        // for(int i=0;i<=ar.length-1;i++){
        //     if (ar[i]%2==0) {
        //         System.out.println(ar[i]);
        //     }

        // }
        // // Q15
        // for(int i=0;i<=ar.length-1;i++){
        //     if (ar[i]%2!=0) {
        //         System.out.println(ar[i]);
                
        //     }
        // }
        // //Q16
        // for(int i=0;i<=ar.length-1;i++){
        //     if (ar[i]>=0) {
        //         System.out.println(ar[i]);
        //     }
        // }
        // // Q17
    //     Scanner input=new Scanner(System.in);
    //    int n=input.nextInt();
    //     boolean isthere=false;
    //     for(int i=0;i<=ar.length-1;i++){
    //         if (ar[i]==n) {
    //             isthere=true;
    //              break;
    //             }
    //     }
    //     if (isthere==true) {
    //         System.out.println("true");
    //     }   
    //     else{
    //         System.out.println("false");
    //     }

        // //Q18
        // Scanner input=new Scanner(System.in);
        //    int n=input.nextInt();
        //    int c=0;
        // for( int i=0;i<=ar.length-1;i++)
        // {
        //     if (ar[i]==n) {
        //         c++;

        //     }
           
        // }
        // if (c==0) {
        //     System.out.println("not there");
               
        //    }
        //    else{
        //        System.out.println("yes the given number is repeted::"+c);
        //    }

        //  // Q19
         Scanner input=new Scanner(System.in);
       
         int n=input.nextInt();
        
        for(int i=0;i<ar.length;i++){
            if (n==ar[i]) {
                System.out.println(i);
                
            }
        }

        // //Q 20
         

    }
}