package co.fx;
/** Read the file using FileReader 
 */
import java.io.FileReader;
import java.io.IOException;

public class ReadfileUsingReader {

	public static void main(String[] args) {
		String path="C:\\Users\\md\\Desktop\\sample.txt";
		FileReader fr=null;
		try {
			fr=new FileReader(path);
			System.out.println("content is --");
			int  c=0;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
