public class Sati {
    public static void main(String[] args) {
        class Employe {
        static int c=0;
            Employe(){
                 c++;
            }
        }
        Employe e1=new Employe();
        Employe e2=new Employe();
        Employe e3=new Employe();
        Employe e4=new Employe();
        Employe e5=new Employe();
        Employe e6=new Employe();
        System.out.println(Employe.c);
    }
}
