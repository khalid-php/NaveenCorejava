package co.fx;
/** Find the Occurence Given the string */
import java.util.HashMap;
import java.util.Map;

public class StringOccurence {

	public static void getCharOccurence(String str) {
		
		char[] count = str.toCharArray();
		Map<Character, Integer> clist = new HashMap<Character, Integer>();
		for (char c : count) {
			if (clist.containsKey(c)) {
				clist.put(c, clist.get(c) + 1);
			} else {
				clist.put(c, 1);
			}
		}
		System.out.println(str + ": " + clist);
	}


	public static void main(String[] args) {
		String  str="this is india";
		getCharOccurence(str);
		
	}
}
