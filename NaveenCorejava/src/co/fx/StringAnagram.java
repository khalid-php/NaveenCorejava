package co.fx;

import java.util.Arrays;

/**
	 * Two String is Anagram or not to find it*/
public class StringAnagram {
	public static boolean isAnagramString(String st1,String st2) {
		String s1 = st1.replaceAll("//s","");
		String s2 = st2.replaceAll("//s","");
		
		if(s1.length()!=s2.length()) {
			return false;
		} else {
			 char[] ch1 = s1.toLowerCase().toCharArray();
			 char[] ch2 = s2.toLowerCase().toCharArray();
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 return Arrays.equals(ch1, ch2);
		}
	}
	public static void main(String[] args) {
		System.out.println(isAnagramString("silent","leanti"));
		System.out.println(isAnagramString("silent","listen"));
	}
}
