import java.util.Scanner;

class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next=null;
    }
}

class opr{
    public static void print(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static node takeInput(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the data ");
    node head=null;
    node tail=null;
    int data=s.nextInt();
    while(data!=-1){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        data=s.nextInt();
    }
    return head;
}
public static node insert(node head,int data,int pos){
    node temp=head;
    node newnode=new node(data);
    int i=0;
    if(pos==0){
        newnode.next=head;
        return newnode;
    }
    while(i<pos-1){
        i++;
        temp=temp.next;
    }
    newnode.next=temp.next;
    temp.next=newnode;
    return head;
}
public static node InsertRec(node head,int pos,int ele){
        if(pos==0){
            node newNode=new node(ele);
            newNode.next=head;
            return newNode;
        }
        head.next=InsertRec(head.next, pos-1, ele);
        return head;
    }

public static node DeleteRec(node head,int pos){
    if(pos==0){
        return head.next;
    }
    head.next=DeleteRec(head.next, pos-1);
    return head;
}
public static node delete(node head,int pos){
    node temp=head;
    int i=0;
    if(pos==0){
        head=temp.next;
        return head;
    }
    while(i<pos-1){
        i++;
        temp=temp.next;
    }
    temp.next=temp.next.next;
    return head;
}
public static int findMid(node head){
    node slow=head;
    node fast=head;
    while(fast.next!=null){
        if(fast.next.next==null){
            return slow.data;
        }
        slow=slow.next;
        fast=fast.next.next;
        
        
    }
    return slow.data;
}

}
public class LinkedList1 {
    public static void main(String[]args){
        opr opr1=new opr();
       node head= opr1.takeInput();
       node head1= opr1.InsertRec(head,2,200);
        opr1.print(head1);
        System.out.println();
        System.out.println("Deleted Recursively");
        node head2=opr1.DeleteRec(head1, 1);
        System.out.println();
        opr1.print(head2);
        int mid=opr1.findMid(head2);
        System.out.println("The mid point of list is : "+mid);


    }
}
