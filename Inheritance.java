

class A{
	public static void display() {
		System.out.println("I am in class A");
	
		
}
	}
 class B extends A{
	public static void print() {
		System.out.println("I am in class B derived from class A");
	}
}
public class Inheritance {
	
	 public static void main(String[] args) {
		 B objB = new B();
		 objB.display();
		 objB.print();
	 }

}
