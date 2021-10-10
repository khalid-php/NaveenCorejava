package co.fx;
	/**
	 To find out the substring in the given string*/
public class SubStringExample {

	public static void main(String[] args) {
		System.out.println(isSubStringExa1("this is khalid","id"));
		System.out.println(isSubStringExa1("khalidhussain","huss"));
		System.out.println(isSubStringExa2("hussain","in"));
		System.out.println(isSubStringExa3("kalkatagar","ga"));
		System.out.println(isSubStringExa3("dankuning","ng"));
	}
	public static boolean isSubStringExa1(String main,String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}
	public static boolean isSubStringExa2(String main,String sub) {
		return main.contains(sub);
	}
	public static boolean isSubStringExa3(String main,String sub) {
		return main.indexOf(sub) !=-1;
	}
}
