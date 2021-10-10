package co.fx;

import java.util.function.IntPredicate;

public class StringVowelsExample {
	/**
	 find the total number of vowels within a java String using:
	 java, java 8 and google guava technique 
	 **/
	public static void main(String[] args) {
		String str="Testing";
		int count=0;
		for(int x=0;x<str.length();x++) {
			if(isVowel(str.charAt(x))) {
				count++;
			}
		}
		System.out.println(count);
		
		IntPredicate tt=	new IntPredicate() {
			
			@Override
			public boolean test(int t) {
			
				return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
						t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
			}
		};
		String strr="naveen java mobile";
		long lo=strr.chars().filter(tt).count();
		System.out.println(lo);
	}
	public static boolean isVowel(char t) {
		
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
		t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}
	
	
	
}
