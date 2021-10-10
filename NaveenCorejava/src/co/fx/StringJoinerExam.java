package co.fx;

import java.util.StringJoiner;

public class StringJoinerExam {
	/**
	 * the String joiner for the deferent*/
	public static void main(String[] args) {
		StringJoiner str = new StringJoiner(",","[","]");
		str.add("khalid")
			.add("hussain")
				.add("md")
					.add("cha");
		System.out.println(str);
					
	}

}
