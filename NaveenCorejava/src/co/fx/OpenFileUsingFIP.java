package co.fx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**Open the file using file input */

public class OpenFileUsingFIP {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\md\\Desktop\\sample.txt";
		FileInputStream fis=null;
		File file = new File(path);
		try {
			fis = new FileInputStream(file);
			System.out.println(" The content  of the : -");
			int c=0;
			try {
				while((c=fis.read())!=-1) {
					System.out.print((char)c);
				}
			} catch (IOException e) {
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			fis.close();
		}
	}

}
