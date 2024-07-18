public class Recursion {
    // // even
    // static void abc(int a){
         
    //     if (a%2==0) {
    //         System.out.println(a);
             
    //     }
    //     if (a<10) {
    //         abc(a+1);
    //     }
     
    // }
    // public static void main(String[] args) {
    //     abc(1);
         
    // }




    // // print 1 to 10
       
    // static void a(int a){
    //     System.out.println(a);
    //     if (a<10) {
    //         a(a+1);
    //     }

    // }
    // public static void main(String[] args) {
    //    a(1); 
    // }



    // // find facto of given number
    //   static int facto(int a){
    //      if (a==1) {
    //         return 1;
    //      } else {
    //         return a*facto(a-1);
    //      }
    //   }
    // public static void main(String[] args) {
    //       int res =facto(27);  
    //       System.out.println(res);
    // }
 
 
     // //
     static int  ax (int a){
      
        if (a==0) {
          return 0;
        } else { 
             return a+ax(a-1);
        }
        
        
     }
    public static void main(String[] args) {
       int ac= ax(10);
       System.out.println(ac);
    }


}
