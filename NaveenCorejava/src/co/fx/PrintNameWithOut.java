package co.fx;

public class PrintNameWithOut {
	/**
	 * Print the name 1000 time without using loop */
	public static void main(String[] args) {
		int count=0;
		String name="khalid";
		String s="i";
		s=s.replaceAll("i","iiiiiiiii");
		s=s.replaceAll("i","iiiiiiiii");
		s=s.replaceAll("i","iiiiiiiii");
		s=s.replaceAll("i",name+"\n");
		System.out.println(s +" : "+count);
	}

}
