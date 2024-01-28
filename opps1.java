import java.util.Scanner;
class Fraction{
    private int  numerator;
    private int denominator;
    Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        
    }
    public void add(int num,int den){
        int d=this.denominator;
        denominator=den*denominator;
        numerator=((denominator)/den)*num+(denominator/d)*numerator;

    }
    public void add(Fraction f2){
        int den=this.denominator;
        this.denominator=this.denominator*f2.denominator;
        this.numerator=(this.denominator/den)*this.numerator+(this.denominator)/f2.denominator*f2.numerator;

    }
    public  void print(){
        System.out.println("Fraction is "+numerator+"/"+denominator);
    }
    public void incrementFr(){
        numerator=denominator+numerator;
        

    }
    public  void simplify(){
        int gcd=1;
        int smallno=Math.min(numerator, denominator);
        for(int i=2;i<=smallno;i++){
            if(numerator%i==0&&denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;

    }
}
public class opps1 {
    public static void main(String[] args) {
        System.out.println("Enter the numerator and denominator ");
        Scanner s =new Scanner (System.in);
        int num=s.nextInt();
        int den=s.nextInt();
        Fraction f=new Fraction(num,den);
        System.out.println("Your fraction is ");
        f.print();
        System.out.println("Fraction after simplication is :");
        f.simplify();
        f.print();
        System.out.println("Your fraction after increasing by 1");
        f.incrementFr();
        f.simplify();
        f.print();
        System.out.println("Do you want to add another fraction in it then enter num and deno");
        int num1=s.nextInt();
        int den1=s.nextInt();
        f.add(num1,den1);
        f.simplify();
        f.print();
        System.out.println("Now again enter num and deno to add it in the fractio f1");
        int num2=s.nextInt();
        int den2=s.nextInt();
        Fraction f2=new Fraction(num2, den2);
        f.add(f2);
        f.simplify();
        f.print();

    }
    
}
