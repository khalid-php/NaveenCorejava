package co.fx;

public class CharOccurenceFind {
	/*
	 * Count the number of the Occurences of the given 
	 * Character in String 
	 * using java 8 streams */
	public static void main(String[] args) {
		String str="Tesing is solutions";
		long f = str.chars().filter(e->(char)e=='s'||(char)e=='i').count();
		System.out.println(f);
	}

}
