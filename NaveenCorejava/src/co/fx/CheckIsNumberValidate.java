package co.fx;

public class CheckIsNumberValidate {
	/**
	 * Check given number is valid or not 
	 * check given phone no valid or not 10 digit
	 * check card no is valid or not -16 digit*/
	public static void main(String[] args) {
//		isNumberChk("5678mn");
		System.out.println(isCorrectNumber("77778"));
//		isPhoneValid("8989899090");
		System.out.println(isCorrectPhone("123456789"));
//		isCCValid("1000000000899090");
	}
	public static boolean isNumberChk(String number) {
		try {
		Long.parseLong(number);
		System.out.println("number is valid "+number);
		}catch(NumberFormatException e) {
			System.out.println("not valid no "+number);
			return false;
		}
		return true;
	}
	public static boolean isCorrectNumber(String number) {
		return number.matches("^(-?\\d.)?-?\\d+$");
		
	}
	public static boolean isPhoneValid(String number) {
		if(number.length()==10 && isNumberChk(number)) {
			System.out.println("valid phone nu"+ number);
			return true;
		}
		System.out.println("not valid phone no "+number);
		return false;
	}
	public static boolean isCorrectPhone(String number) {
//		return number.matches("[0-9]{10}");
		return number.matches("\\d{10}");
		
	}
	public static boolean isCCValid(String number) {
		if(number.length()==16 && isNumberChk(number)) {
			System.out.println("valid cc "+ number);
			return true;
		}
		System.out.println("not valid cc "+number);
		return false;
	}
}
