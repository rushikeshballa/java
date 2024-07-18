public class Class {
    public static void main(String[] args) {
        class Employe {
        String fullname;
        int basic;
        int da;
        int vat;
        int ptp;
        double ptax;   

       Employe (String fn,int ba,int d,int va,int pt,double p){
           System.out.println("Employe details ");
           System.out.println(fn);
           this.fullname=fn;
           this.basic=ba;
           this.da=d;
           this.vat=va;
           this.ptp=pt;
           this.ptax=p;

        }
        double salary(){
            System.out.print("salary: ");
           return  this.basic+((double)this.da/100*this.basic)+((double)this.vat/100*this.basic)-this.ptp-((double)this.ptax/100*this.basic);
        }
        }
      
        Employe e1=new Employe("venky",30000,20,80,1000,1.0);
        double res=e1.salary();
        System.out.println(res);
        Employe e2 =new Employe( "bobby ", 50000,20,80,2000,2 );
        double res1=e2.salary();
        System.out.println(res1);
        
    }
}
