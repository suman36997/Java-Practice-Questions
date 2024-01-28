import java.util.Scanner;
class Assignment{
    Scanner sc=new Scanner(System.in);
    String name;
    int ConsumedUnits;
    void input(){
        
        System.out.println("Enter the name of owner");

        name=sc.nextLine();
        System.out.println("Enter the number of units consumed ");
        ConsumedUnits=sc.nextInt();
       
    }
    double calculate(String name,int ConsumedUnits){
        this.name=name;
        this.ConsumedUnits=ConsumedUnits;
        
        double totalElecBill;
        if(ConsumedUnits>=1 && ConsumedUnits<=102){
           totalElecBill =ConsumedUnits*5.30;
        return totalElecBill;

          
        }
        else if(ConsumedUnits>=103 && ConsumedUnits<=180){
            totalElecBill =ConsumedUnits*5.97;
        return totalElecBill;

           
        }
        else if(ConsumedUnits>=181 && ConsumedUnits<=300){
            totalElecBill =ConsumedUnits*6.97;
        return totalElecBill;

           
        }
        else if(ConsumedUnits>=301 && ConsumedUnits<=600){
            totalElecBill =ConsumedUnits*7.31;
        return totalElecBill;

           
        }
        else if(ConsumedUnits>=601 && ConsumedUnits<=900){
            totalElecBill =ConsumedUnits*7.58;
        return totalElecBill;

           
        }
        else {
            totalElecBill =ConsumedUnits*8.99;
        return totalElecBill;

        }

    }
    void display(){
        System.out.println("The name of owner is:"+name);
        System.out.println("Units Consumed by "+name+" "+ConsumedUnits);
        System.out.println("Total Electricity bill of "+name+" "+calculate(this.name, this.ConsumedUnits));
    }
}
public class ElectricityBill {
    public static void main(String [] args){
        Assignment A1=new Assignment();
        A1.input();
        A1.display();
        Assignment A2=new Assignment();
        A2.input();
        A2.display();
    }
}
