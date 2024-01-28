import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class student{
   
    private String dept,exAct,phno,state,pin,stName,marks;
    Scanner sc=new Scanner(System.in);

   HashMap<String,ArrayList<String>>st=new HashMap<>();
   ArrayList<String>st1=new ArrayList<>();

    
    public void InsertSt(){
 
        System.out.println("Enter the name of student:");
        stName=sc.next();
        this.stName=stName;
        st.put(stName, st1);
    }
    public void SearchSt(){
        System.out.println("Enter the student name to find its details:");
        stName=sc.next();
        boolean found=true;
        for(String name:st.keySet()){
            if(name.equals(stName)){
                found=true;
                break;
            }
            else{
                found=false;
            }
        }
        if(found){
            System.out.println(stName+" is found");
            System.out.println("------------------"+stName+" Details"+"-----------------");
            // System.out.println("Academic Records: ");
            // System.out.println("Dept Name: "+st(stName,st1.get(0)));
            // System.out.println("Marks Obtained: "+marks);
            // System.out.println("Extra Activities: "+exAct);
            // System.out.println("Address: ");
            // System.out.println("State : "+state);
            // System.out.println("PIN : "+pin);
            // System.out.println("Mob No. : "+phno);
            System.out.println(st.get(stName));
            // for(int i=0;i<st1.size();i++){
            //     System.out.println(st1.get(i));
            // }
        }
        else{
            System.out.println("No record found");
        }
    }
    public void Update_rec(){

    System.out.println("Enter the Department name:");
    dept=sc.next();
    st1.add(dept);
    System.out.println("Enter the marks obtained by student");
    marks=sc.next();
    st1.add(marks);
    System.out.println("Enter the extra Activies in which student involved");
    exAct=sc.next();
    st1.add(exAct);
    
    

    }
    public void Modify_rec(){
  

        System.out.println("Enter the state :");
        state=sc.next();
        st1.add(state);
        System.out.println("Enter the phone number:");
        phno=sc.next();
        st1.add(phno);
        System.out.println("Enter the PIN:");
        pin=sc.next();
        st1.add(pin);
        

    }
    public void deleteStRec(){
        System.out.println("Enter the name of student whom you want to Delete records");
        st.remove(stName);
    }

}

public class miniproj{
public static void main(String[]args){
    student s=new student();
    Scanner sc=new Scanner(System.in);

    
    int i=-1;
    while(i!=0){
        System.out.println("Enter 1 for Insert Student\nEnter 2 for Update Records\nEnter 3 for Modify Records");
    System.out.println("Enter 4 for Delete Student Rcords\nEnter 5 for Search Students");
        i=sc.nextInt();
        switch(i){
            case 1:
            s.InsertSt();
            break;
            case 2:
            s.Update_rec();
            break;
            case 3:
            s.Modify_rec();
            break;
            case 4:
            s.deleteStRec();
            break;
            case 5:
            s.SearchSt();
            break;
            case 0:
            return;
            default:
            System.out.println("Try again!");


        }
    }
    
}
}