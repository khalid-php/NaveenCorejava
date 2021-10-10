package co.fx;

import java.util.Arrays;
import java.util.BitSet;
/**
 * Print the Number 1 to 100  without using loop and recursive method */
public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		//first way to find 
		Object[] num=new Object[100];
		Arrays.fill(num,new Object() {
			int count=1;
			@Override
			public String toString() {
				return Integer.toString(count++);
			}
		});
		System.out.println(Arrays.toString(num));
		
		//2. BitSet Program
		String  set= new BitSet() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{set(1,101);}}.toString();
		System.out.append(set,1,set.length());
		
	}

}
