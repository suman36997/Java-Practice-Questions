import java.util.Scanner;
class add implements Runnable{
    private int a;
    private int b;
    private int sum;
@Override
public void run(){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter two no. to add");
    a=sc.nextInt();
    b=sc.nextInt();
    sum=a+b;
    SharedData.setSum(sum);
}
}
class StringInput implements Runnable{
    private String str;
    Scanner sc=new Scanner(System.in);
    public void run(){
        System.out.println("Enter a string");
        str=sc.nextLine();
        SharedData.setString(str);
    }
}
class printResult implements Runnable{
    int sum;
    String str;
    public void run(){
        sum=SharedData.getSum(sum);
        str=SharedData.getString(str);
        String result=sum + str;
        System.out.println("The contination of sum and string is : " + result);
    }
}
public class thread {
    public static void main(String []args){
        Thread t1 =new Thread(new add());
        Thread t2 = new Thread(new StringInput());
        Thread t3=new Thread(new printResult());
        t1.start();
        t2.start();
        t3.start();
    }
}
