package co.fx;
/**
 * Find the reverse nunber using recursive method*/
public class ReverseNumber {
	public static void reverseNum(int num) {
		while(num>0) {
			int rev=num%10;
			System.out.print(rev);
			num=num/10;
		}
	}
	//using recursive 
	public static void reverseNumRecursive(int num1) {
		if(num1<10) {
			System.out.print(num1);
			return;
		}else {
			System.out.print(num1%10);
			reverseNumRecursive(num1/10);
		}
	}
	public static void main(String[] args) {
//		reverseNum(2345);
		reverseNumRecursive(7678);
	}

}
