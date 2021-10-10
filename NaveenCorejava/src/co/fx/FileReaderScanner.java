package co.fx;

import java.io.File;
import java.util.Scanner;
/**input from the outsout and print the txt file
 * or reading the value of the file*/
public class FileReaderScanner {

	public static void main(String[] args) {
		String path="C:\\Users\\md\\Desktop\\sample.txt";
		File file = new File(path);
		Scanner sc=null;
		try {
			sc=new Scanner(file);
			System.out.println("content is -");
			if(sc.hasNext()) {
				String out = sc.nextLine();
				System.out.println(out);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}

}
