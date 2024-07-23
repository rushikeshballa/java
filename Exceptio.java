public class Exceptio
 {
    public static void main(String[] args) {
        try {
           System.out.println(100/0);
        }
         catch (ArithmeticException e) {
          System.out.println("Expection ");
        }
        
            try {
            int a=1999999999;
            int b=1999999999;
            int c=a*b;
            if(c<0) {
                throw new ArithmeticException ();
            }
            else{
                System.out.println(a*b);
            }
            
        } 
       
        catch ( ExceptionInInitializerError a) {
            System.out.println("out");
        }
         catch(ArithmeticException e){
         System.out.println("asdsf");
        }
       
    
       
    }
}
