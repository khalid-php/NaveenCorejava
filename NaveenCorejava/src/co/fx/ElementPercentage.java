package co.fx;

import java.text.DecimalFormat;

/**
	 * Find the percentage of Uppercase Letters, Lowercase Letters,
	 * Digits and Special Characters in String 
	 * Uppercase 10%
	 * Lowercase 34% 
	 * digit 12% 
	 * special character %*/
public class ElementPercentage {
	public static void getCharPercentage(String str) {
		if(str.isEmpty()) {
			System.out.println("Empty");
			return;
		}
		if(str.length()==1) {
			System.out.println("only one character  "+str);
			return;
		}
		int len=str.length();
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int digitCount=0;
		int specialCount=0;
		for(int i=0;i<len;i++) {
			char ch= str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if(Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCount++;
			}
		}
		double upperCasePersentage=(upperCaseCount*100)/len;
		double lowerCasePersentage=(lowerCaseCount*100)/len;
		double digitPersentage=(digitCount*100)/len;
		double specialPersentage=(specialCount*100)/len;
		DecimalFormat format = new DecimalFormat("##.##");
		System.out.println("Upper case persentage%- "+format.format(upperCasePersentage));
		System.out.println("Lower case persentage%- "+format.format(lowerCasePersentage));
		System.out.println("Digit Persentage %"+format.format(digitPersentage));
		System.out.println("Special Persentage %"+format.format(specialPersentage));
		
	}

	public static void main(String[] args) {
		getCharPercentage("Digit 123");
	}

}
