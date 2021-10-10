package co.fx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLengthExample {
	/**
	 * how to find the length of the  String without the 
	 * length method*/
	public static void main(String[] args) {
		String str="Trangle is use";
		System.out.println(str.toCharArray().length);
		System.out.println(str.lastIndexOf(""));
		Matcher val = Pattern.compile("$").matcher(str);
		val.find();
		val.end();
		int len = val.end();
		System.out.println(len);
		System.out.println(str.split("").length);
		int le= new StringBuilder("khalid").length();
		System.out.println(le);
		int count=0;
		for(int i:str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		System.out.println(getLength("Testing java"));
	}
	public static int getLength(String str) {
		int i=0;
		try {
			while(true) {
				str.charAt(i);
				i++;
			}
		}catch (IndexOutOfBoundsException e) {
			return i;
		}
		
		
	}

}
