
import java.util.ArrayList;
public class arrayList {
public static void main(String[] args) {
ArrayList<String>	Name=new ArrayList<String>();
Name.add("Ram");
Name.add("Sam");
Name.add("jado");
System.out.println(Name);
Name.add("HIT");
System.out.println(Name);
Name.add(0,"jado");
System.out.println(Name);
Name.remove(1);
System.out.println(Name);
Name.remove("HIT");
Name.clear();
System.out.println(Name);
}
}
