package co.fx;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayAverageExample {
	/**
	 * Calculate the Average the of the arrays using  
	 * Simple loop 
	 * java 8 
	 */
	public static void main(String[] args) {
		int num[]= {1,2,3,4,6,8,9,10};
		int total=0;
		for(int e:num) {
			total=total+e;
		}
		System.out.println("Total no of array -"+total);
		System.out.println("Avg is : "+(total/num.length));
		
		//java 8 :Streams
		OptionalDouble al=Arrays.stream(num).average();
		System.out.println(al.getAsDouble());
		
	}

}
