

public class Functions1 {
    static int  com(int a,int b,int c){
        if (a>b && a>c) {
             return a;            
        }
        if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }

    }
    
    public static void main(String[] args) {
     int    gre = com(45,67,23);
     System.out.println(gre);
    }
}
