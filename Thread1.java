class Admission extends Thread{
    public void run(){
       try{
        for(int i=0;i<10;i++){
            System.out.println("Admission is completed "+i);
            sleep(1000);
        }
       }catch(Exception e){
        System.out.println(e);
       }

        
    }
}
class Deposit extends Thread{
    public void run(){
        try{
         for(int i=0;i<10;i++){
             System.out.println("Deposit is completed "+i);
             sleep(1000);
         }
        }catch(Exception e){
         System.out.println(e);
        }
 
         
     }
}
class RollNo extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Roll No. is provided"+i);
                sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Thread1 {
    public static void main(String[] args) {
       try{
        Admission ad=new Admission();
        ad.start();
        ad.join();
        Deposit dp=new Deposit();
        dp.start();
        dp.join();
        RollNo rl=new RollNo();
        rl.start();
        rl.join();
       }
       catch(Exception  e){
        System.out.println(e);
       }
       
       

    }
    
}
