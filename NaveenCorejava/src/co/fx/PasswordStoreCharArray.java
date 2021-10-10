package co.fx;

import java.util.Arrays;

public class PasswordStoreCharArray {
	/**
	 * Why password should stroe in char[] char array instead of string */
	public static void main(String[] args) {
		String pwd="khalid@123";
		System.out.println("password is "+pwd);
		
		char[] c=new char[] {'k','h','u','s','@','H'};
		System.out.println("this is password "+c);
		
		Arrays.fill(c,'*');
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	
	}

}
