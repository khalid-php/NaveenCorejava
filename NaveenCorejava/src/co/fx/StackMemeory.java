package co.fx;
/**
 * What is stack memory and how to get Stackoverflow Error and
 * how to rectify*/
public class StackMemeory {
	public static void m1() {
		m2();
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
		int i=30;
		System.out.println(i);
	}
	public static void main(String[] args) {
		m1();
		
	}
}
