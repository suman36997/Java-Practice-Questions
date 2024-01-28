import java.util.Scanner;
public class StackAdt {
    Scanner sc=new Scanner(System.in);
    
    private int top=-1;
    private int maxsize=10;
    private int []stk=new int[maxsize];
    void push(){
        if(top==stk.length-1){
            System.out.println("Sorry! Stack is full");
        }
        else{
            System.out.println("Enter the element to push");
        int n=sc.nextInt();
        
            stk[++top]=n;
            System.out.println(n+ " pushed Successfully");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Sorry! Stack is Empty");
        }
        else{
            int n=stk[top--];
            System.out.println(n+" popped Successfully");
        }
    }
    void display(){
        if(top==-1){
            System.out.println("No element for display");
        }
        else{
            System.out.println("Elements in the stack are : ");
            for(int i=top;i>=0;i--){
                System.out.print(stk[i]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        StackAdt stk=new StackAdt();
        while(true){
            System.out.println("Enter 1 for push\nEnter 2 for pop\nEnter 3 for display Elements \nEnter 4 for Exit");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                stk.push();
                break;
                case 2:
                stk.pop();
                break;
                case 3:
                stk.display();
                break;
                case 4:
                System.out.println("------Program Terminating------");
                System.exit(0);
                break;
                default:
                    System.out.println("You entered wrong choice");
                

            }
        }

    }

}
