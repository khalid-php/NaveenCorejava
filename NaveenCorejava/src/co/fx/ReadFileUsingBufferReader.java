package co.fx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * Read the file using BufferdReader */
public class ReadFileUsingBufferReader {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\md\\Desktop\\sample.txt";
		BufferedReader br=null;
		try {
			File file = new File(path);
			br = new BufferedReader(new FileReader(file));
			System.out.println("the content of -");
			int c=0;
			while((c=br.read())!=-1) {
				System.out.print((char)c);
			}
			
		}catch (Exception e) {
			
		}finally {
			br.close();
		}
	}

}
