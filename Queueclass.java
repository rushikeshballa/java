import java.util.Scanner;
public class Queueclass {
    public static void main(String[] args) {
        class Queue {
        int [] qu;
            int le;
            int ri;
            
            Queue(){
             this.qu= new int[10000];
             this.le=0;
             this.ri=-1;
            
            } 
            void eque(int x){
                if(ri==5+le-1){
                        System.out.println("Queue Over flow");
                    }
                    else{
                        this.qu[++ri]=x;
                        this.disp();
                    }
            }
            void dque(){
                if(ri-le==ri-1){
                        System.out.println("Queue empty ");
                        
                    }
            
                    else{
                        this.le++;
                        disp();
                    }
            }
            
             void disp(){
                        for(int i=le;i<=this.ri;i++){
                            System.out.print(this.qu[i]+"\t");
                        }
                        System.out.println();
                }
               
        }
         Queue s1 = new Queue();
         while (true) {
                System.out.println("Press 1. to PUSH \t 2. to POP \t 3. to display \t 4.to quit");
                Scanner input = new Scanner(System.in);
                int ch = input.nextInt();
                if(ch==1){
                        System.out.println("Enter the value you want to eque");
                        int val = input.nextInt();
                        s1.eque(val);
                    }
                    if(ch==2){
                        s1.dque();
                      
                    }
                    if(ch==3){
                        s1.disp();
                    }
                    if(ch==4){
                        break;
                    }
         }
        
        
    }
    
}
