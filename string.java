package ss;

import java.util.Scanner;

public class string {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		java.lang.String str=s.next();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
		
}
	}
