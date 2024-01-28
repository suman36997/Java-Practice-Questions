
public class factusingThread extends Thread {
    private int n;
    private String r;
    factusingThread(String r,int n){
        this.r=r;
        this.n=n;
    }
    public int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            try{
                System.out.println(r+" "+n+" "+ (n-1));
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
        return n*fact(n-1);
        
    }
    public void run(){
        fact(n);
    }
    public static void main(String[] args){
        factusingThread t1=new factusingThread("1", 5);
        factusingThread t2=new factusingThread("2", 4);
        t1.start();
        t2.start();
        int n=t1.fact(5);
        System.out.println("The factorial of first thread is :"+ n);
       
    }
}


