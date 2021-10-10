package co.fx.stack;

/**W A P to find out the  Stackoverflow error and rectify and solve
 * it */
public class PrintNumber {
	static int count = 0;

	public static void printNumber() {
//		try {
//			if(count <= 100000) {
//				System.out.println(" Hello ");
//				count++;
//				printNumber();
//			}
//		} catch(StackOverflowError e) {
//			
//		}
		if (count <= 100000) {
			System.out.println(" Hello ");
			count++;
			printNumber();
		}
	}

	public static void main(String[] args) {
		printNumber();
		System.out.println("..bye");
	}

}
