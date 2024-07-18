public class Thu {
    public static void main(String[] args) {
        int rem;
        int rv=0;
        int n=1234;
        while (n!=0) {
            rem=n%10;
            if (rem%2==0) {
                int temp=rem%10;
                rv=rv*10+temp;
                rem=rem/10;
            }
            
            n=n/10;
        }
        System.out.println(rem);

    //     int c=0;
    //     int n=345;
    //     while (n!=0) {
    //        n= n/10;
    //       c++;
    //     }
    //     System.out.println(c);
    }
}
