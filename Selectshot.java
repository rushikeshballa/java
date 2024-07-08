public class Selectshot {
   public static void main(String[] args) {
    int[] ar={16,5,3,1,8,7,2,4,};
    for (int i = 0; i <=ar.length-1; i++) {
        for (int j = 0; j <=ar.length-2; j++) {
            if (ar[j]>ar[j+1]) {
                int temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
                
            }
        }
        
    }int max=ar[0];
    for (int k = 1; k<=ar.length-2; k++) {
        if (max<ar[k]) {
               max=ar[k];
        }     
        
    }System.out.println(max);
        
    
   }
}
