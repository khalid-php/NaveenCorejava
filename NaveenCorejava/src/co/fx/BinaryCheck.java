package co.fx;
	/**
	 * @apiNote Binary Number is check */
public class BinaryCheck {

	public static void main(String[] args) {
		isBinaryNumber(1110);
	}
	public static void isBinaryNumber(int number) {
		boolean isBinary=true;
		int copyNumber=number;
		while(copyNumber!=0) {
			int rem=copyNumber%10;
			if(rem >1) {
				isBinary=false;
				break;
			}else {
				copyNumber=copyNumber/10;
			}
		}
		if(isBinary) {
			System.out.println(number+" is binary");
		}
		System.out.println(number+" is not binary");
	}
	
}
