public class Sat {
    public static void main(String[] args) {
        int[] ar={104,113,122,131,140,203,212,221,230,302,311,320,401,410,500};
        int sum=0;
        for(int i=0;i<=ar.length-1;i++){
           
           while (ar[i]!=0) {
            sum=sum+ar[i]%10;
            ar[i] =ar[i]/=10;
            if (sum==5) {
                System.out.println(sum);
            }
            
           }
           
        } 
    }
    
}
