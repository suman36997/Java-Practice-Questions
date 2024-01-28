

public class TryChache {
public static void main(String[] args) {
	try {
		System.out.println("rest of the code");
		int a=20,b=0,c;
		c=a/b;
		System.out.println("c");
		System.out.println("like");
	}
	catch(ArithmeticException a){
		 int d=20,e=2,f;
		f=d/e;
		System.out.println("zero");
		System.out.println(f);
	}

	finally {
		System.out.println("sub");
		
	}
	System.out.println("main");
}
}
