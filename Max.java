public class Max {
    public static void main(String[] args) {
        int[] ar={16,15,3,1,125,2,4,};
        int max=ar[0];
        int semax=ar[0];
        for (int i = 1; i <=ar.length-1; i++) {
            if (max<ar[i]) {
               semax=max;
                max=ar[i];

            }
            else{
                if (max==semax || semax<ar[i]) {
                    semax=ar[i];
                }
               
               
            }
        }
        System.out.println(semax);
    }
    
}
