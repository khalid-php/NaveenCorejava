package co.fx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
	/**
	 * @apiNote W A P to count the word in Capital letter in given string
	 * */
public class StringWordCount {

	public static void main(String[] args) {
		String str="NaveenTestClass";
		//first way to solve the issue
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) > 'A' && str.charAt(i)< 'Z') {
				count++;
			}
		}
		System.out.println(count);
		
		//second way to 
		int count1=0;
		for(int ii=0;ii<str.length();ii++) {
			if(str.charAt(ii) > 65 && str.charAt(ii)<90) {
				count1++;
			}
		}
		System.out.println(count1);
		//Third way to find 
		int count3 =0;
		for(int i3=0;i3<str.length();i3++) {
			if(Character.isUpperCase(str.charAt(i3))) {
				count3++;
			}
		}
		System.out.println(count3);
		
		//Four way to find using stream()
		long count4=str.chars().filter(e->e >=65 && e<=90).count();
		System.out.println(count4);
		
		//five ways
		long count5=str.chars().filter(e->Character.isUpperCase(e)).count();
		System.out.println(count5);
		
		//six way to find
		String reg="[A-Z] +";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		int count7=0;
		while(matcher.find()) {
			 count7+= matcher.group().length();
		}
		System.out.println(count7);	
	
	}
	
}
