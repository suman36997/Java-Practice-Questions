package ss;
import java.util.ArrayList;
import java.util.Scanner;
public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>Name=new ArrayList<String>();
		
		Scanner s=new Scanner(System.in);
		Name.add("India");
		Name.add("Myanmaar");
		Name.add("Turkey");
		Name.add("Pakistam");
		Name.add("Bhutan");
		Name.add("Greece");
		Name.add("Hungry");
		Name.add("Switzerland");
		Name.add("Manamma");
		Name.add("Afghanistan");
		
		System.out.println("Which country you want to select");
		
			System.out.println(Name);
		
		int input=s.nextInt();
		System.out.print(Name.get(input));
		System.out.println(" "+"is Selected");
		System.out.println("The district in Selected country are");
		ArrayList<String>Name1=new ArrayList<String>();
		Name1.add("Nalada");
		Name1.add("Patna");
		Name1.add("Madhubani");
		Name1.add("Jaynagar");
		Name1.add("Pandaul");
		Name1.add("Raniganj");
		Name1.add("Ranabigah");
		Name1.add("Rajgir");
		Name1.add("Medinipur");
		
			System.out.print(Name1);
		
		
	}

}
