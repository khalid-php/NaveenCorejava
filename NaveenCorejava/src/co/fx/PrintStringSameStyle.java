package co.fx;

public class PrintStringSameStyle {
	/**
	 /"Hello"/
	 /'Hello'/
	 "Hello"
	 I love "java"and "programming" 
	 'I love "java" and "programming" and "moves" '
	 
	 * */
	public static void main(String[] args) {
		System.out.println("/\"Hello\"/");
		System.out.println("/'Hello'/");
		System.out.println("'/'Hello'/'");
		System.out.println("\"/'Hello'/\"");
		System.out.println("\"Hello\"");
		System.out.println("I love \"java\" is \"programming\" and \"movies\"");
		System.out.println("'I love \"java\" is \"programming\" and \"movies\"'");
		System.out.println(getXpath("khalid"));
	}
	public static String getXpath(String name) {
		String xpath="//input[@id='"+name+"']";
		return xpath;
	}
}
