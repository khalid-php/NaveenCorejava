package co.fx;
	/**
	 * WAP to convert String to number without using Integer.parsInt()
	 * or any method */
public class StringToNumber {
	//first way to convert
	public static int stringToNumberConvert(String str) {
		if(str.length()==1) {
			return (int)str.charAt(0)-48;
		}
		if(str.isEmpty()) {
			System.out.println("Empty String: assign value");
		}
		int num=0;
		int length = str.length();
		for(int i=0;i< length;i++) {
			num=num*10+((int)str.charAt(i)-48);
		}
		return num;
		
	}
	
	//second way to convert sring to number
	public static int StringToNumberConvert2(String str) {
		int sum=0;
		char[] charArray = str.toCharArray();
		int zeroAse=(int)'0';
		for(int i=0;i<charArray.length;i++) {
			int asc=(int)charArray[i];
			sum=sum*10+(asc-zeroAse);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(stringToNumberConvert(""));
		System.out.println(StringToNumberConvert2("9897"));
	}
}
