public class Stack {
    public static void main(String[] args) {
        class Employe {
        String fullname;
        int basic;
        int da;
        int vat;
        int ptp;
        double ptax;
        static int c=0;   

       Employe (String fn,int ba,int d,int va,int pt,double p){
        c++;
           this.fullname=fn;
           this.basic=ba;
           this.da=d;
           this.vat=va;
           this.ptp=pt;
           this.ptax=p;

        }
       
        }
        Employe e1=new Employe("venky",30000,20,80,1000,1.0);
        Employe e3=new Employe("venky",30000,20,80,1000,1.0);
        Employe e2=new Employe("venky",30000,20,80,1000,1.0);
        Employe e4=new Employe("venky",30000,20,80,1000,1.0);
        Employe e5=new Employe("venky",30000,20,80,1000,1.0);
        System.out.println(Employe.c);
        
    }
}
