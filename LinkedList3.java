import java.util.Scanner;

class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next=null;
    }
}
class Doublenode{
    node head;
    node tail;
}

public class LinkedList3 {
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static node takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data");
        int data=s.nextInt();
        node head=null;
        node tail=null;
        while(data!=-1){
            node newNode=new node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            data=s.nextInt();

        }
        return head;

    }
    public static node merge(node h1,node h2){
        node t1=h1;
        node t2=h2;
        node h3=null,t3=null;
        if(t1.data<t2.data){
             h3= t1;
             t3 = t1;
             t1=t1.next;
        }
        else{
             h3=t2;
             t3=t2;
             t2=t2.next;
        }
        while(t1.next!=null && t2.next!=null){
            if(t1.data<t2.data){
                t3.next=t1;
                t1=t1.next;
            }
            else{
                t3.next=t2;
                t2=t2.next;
            }
            t3=t3.next;
        }
        while(t1.next!=null){
            t3.next=t1;
            t1=t1.next;
            t3=t3.next;
        }
        while(t2.next!=null){
            t3.next=t2;
            t2=t2.next;
            t3=t3.next;
        }
        return h3;
    }
    public static node midpNode(node head){
        node slow=head;
        node fast=head;
        while(fast.next!=null){
            if(fast.next.next==null){
                return slow;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Doublenode ReverseRbetter(node head){
        if(head==null || head.next==null){
            Doublenode ans =new Doublenode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        Doublenode smallAns=ReverseRbetter(head.next);
        smallAns.tail.next=head;
        head.next=null;
        Doublenode ans=new Doublenode();
        ans.head=smallAns.head;
        ans.tail=head;
        return ans;
    }
    public static node ReverseR2(node head){
        if(head==null||head.next==null){
            return head;
        }
        node temp=head.next;
        node finalhead=ReverseR2(head.next);
        temp.next=head;
        head.next=null;
        return finalhead;

    }
    public static node ReverseR(node head){
        if(head==null || head.next==null){
            return head;
        }
        node finalhead=ReverseR(head.next);
        node temp=finalhead;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        return finalhead;
    }
    public static node mergesort(node head){
        if(head==null||head.next==null){
            return head;
        }
        node h1=midpNode(head);
        node h2=h1.next;
        h1.next=null;

       node head1= mergesort(head);
       node head2= mergesort(h2);
       node h3=merge(head1, head2);
       return h3;

    }
    public static node ReverseIteratively(node head){
        node curr=head;
        node prev=null;
        node temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    
    public static void main(String []args){
        node h1=takeInput();
        node h2=takeInput();
        node h7=takeInput();
        node h8=takeInput();
        node h4=ReverseR(h1);
        node h9=ReverseIteratively(h8);
        Doublenode h5=ReverseRbetter(h2);
        node h6=ReverseR2(h7);
        System.out.println("The reverse of h1 is: ");
        display(h4);
     System.out.println("The reverse of h2 in better way is: ");
        display(h5.head);
        System.out.println("The reverse of h2 by Reverse Recursively 2 is: ");
        display(h6);
        System.out.println("The reverse of h9 in iterative way is: ");
        display(h9);
        

        try{
                    node h3=merge(h1, h2);

         display(h3);
        }
        catch(NullPointerException e){
            System.out.print("Hurrah ");
        }
        finally{
            System.out.println("Code executed Successfully");
        }

        
        //  try{
        //     node h1=takeInput();
        //     display(h1);

        //     node h3=mergesort(h1);


        //     display(h3);

        //  }
        //  catch(NullPointerException e){
        //     System.out.print("Hurrah ");
        // }
        //  finally{
        //     System.out.println("done");
        //  }

    }
}
