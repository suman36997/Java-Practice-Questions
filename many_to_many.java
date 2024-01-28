

class Student{
    String name;
    Degree []dr;
    Student(String name,Degree []dr){
        this.name=name;
        this.dr=dr;
    }
    void print(){
        System.out.println("Student Name is : "+ name);
        for(int i=0;i<dr.length;i++){
        System.out.println("No. "+(i+1) +" degree Obtained by "+name +" " +dr[i].deg);

        }
        System.out.println("--------------------------------");

    }

}
class Degree{
    String deg;
    Degree(String deg){
        this.deg=deg;
    }
}
public class many_to_many {
    public static void main(String[] args) {
        Degree d1=new Degree("Matric");
        Degree d2=new Degree("Entermediate");
        Degree d3=new Degree("B.tech");
        Degree d4=new Degree("M.tech");
        Degree d5=new Degree("PHD");
        Degree []degr={d1,d2,d3,d4,d5};
        Student std1=new Student("Suman",degr);
        Student std2=new Student("Saurav",degr);
        Student std3=new Student("Utkrash",degr);
        Student std4=new Student("Aditya",degr);
        std1.print();
        std2.print();
        std3.print();
        std4.print();


    }
}
