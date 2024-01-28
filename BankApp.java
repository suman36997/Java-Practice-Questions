class Bank{
    String name,Acno;
    int amount;
    public void createAc(String name,String Acno){
        this.name=name;
        this.Acno=Acno;
        System.out.println(" -------------------------- Account Section -------------------");

        System.out.println("Hi...."+this.name);
        System.out.println("Your account created Successfully");
        System.out.println("Your Account no. "+this.Acno);

    }
    public void deposit(int dp){
        this.amount=this.amount+dp;
        System.out.println(" -------------------------- Deposit Section -------------------");
        System.out.println("Hi!...."+this.name+ " Amount " +dp+" Deposited Successfully");
        System.out.println("Your Total balance : "+this.amount);
    }
    public void withdraw(int wit){
        if(this.amount>=wit){
            if(this.amount>=1000){
            this.amount=this.amount-wit;

            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("please maintain minimum balance");
        }
        System.out.println(" -------------------------- Withdraw Section -------------------");
        System.out.println("Hi!...."+this.name+ " Amount " +wit+" Withdraw Successfully");
        System.out.println("Your Total balance : "+this.amount);

    }
}
class threadcreateAcount extends Thread{
    String name,Acno;
    int amount;
    
    
   
    threadcreateAcount(Bank ba,int amount,String name,String Acno){
       this.name=name;
       this.Acno=Acno;
       this.amount=amount;
        ba.createAc(this.name, this.Acno);
    }
    

}
    
class threadDeposit extends Thread{
    
    int amount;
    
   
    threadDeposit(Bank ba,int amount){
       
       this.amount=amount;
        ba.deposit(this.amount);
    }

}
class threadWithdraw extends Thread{
    
    int amount;
    
   
    threadWithdraw(Bank ba,int amount){
       
       this.amount=amount;
        ba.withdraw(this.amount);
    }

}

public class BankApp {
    public static void main(String[] args) {
        Bank ba=new Bank();
        threadcreateAcount thc=new threadcreateAcount(ba,1000,"Suman","punb0mbgb06");
        threadDeposit thd=new threadDeposit(ba, 5000);
        threadWithdraw thw=new threadWithdraw(ba, 1000);

    }

}
