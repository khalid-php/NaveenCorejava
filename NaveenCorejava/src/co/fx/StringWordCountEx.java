package co.fx;

public class StringWordCountEx {
	/**
	 * W A P to Find the count of the character in given string*/
	public static void main(String[] args) {
		String str="nameTestthiscount";
		int c=0;
		if(Character.isLowerCase(str.charAt(0))) {
			c++;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i)<='Z') {
				c++;
			}
		}
		System.out.println(c);
	}

}
