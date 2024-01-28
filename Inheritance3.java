
class Father{
	public static void print() {
	System.out.println("I am in father class");
}
	}
	class Son extends Father{
		public static void display() {
			System.out.println("I am in son class");
		}
	}
public class Inheritance3 {
public static void main(String [] args) {
	Son A=new Son();
	A.print();
	A.display();
}
}
