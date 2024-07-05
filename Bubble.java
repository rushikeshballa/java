public class Bubble {
     public static void main(String[] args) {
        int[] ar={96,54,40,34,45,65,59};
        for (int i = 0; i < ar.length-1; i++) {
            for(int k=0;k<=ar.length-2;k++){
                 if (ar[k]>ar[k+1]) {
                    int temp=ar[k];
                    ar[k]=ar[k+1];
                    ar[k+1]=temp;
                
            }
        }
    }
            for(int j=0;j<=ar.length-1;j++){
                System.out.println(ar[j]);
            }
        
        
     }
}
