package co.fx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
	 * Find the Occurence of the digit */
public class FindDigitOccurence {
	
	public static void getDigitOccurence(Long number) {
		Map<Long,Integer> digitMap=new HashMap<Long,Integer>();
		while(number!=0) {
			long lastDigit = number%10;
			if(digitMap.containsKey(lastDigit)) {
				digitMap.put(lastDigit,digitMap.get(lastDigit)+1);
			} else {
				digitMap.put(lastDigit,1);
			}
			number=number/10;
		}
		Set<Long> keys = digitMap.keySet();
		for(Long key:keys) {
			System.out.println(key +" : "+digitMap.get(key));
		}
	}
	
	public static void main(String[] args) {
		getDigitOccurence(12234l);
	}

}
