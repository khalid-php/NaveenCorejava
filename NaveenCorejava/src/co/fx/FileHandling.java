package co.fx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
	/**
	 * File handling copy one file to another file or folder the 
	 * string or content or count the all eleemnt*/
public class FileHandling {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/md/Desktop/PAN Card_1.pdf");
		File copyfile = new File("C:/Users/md/Desktop/PAN CardCopy.pdf");
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		fis = new FileInputStream(file);
		fos =new FileOutputStream(copyfile);
		System.out.println(fis.available());
		int i=0;
		while((i=fis.read())!=-1) {
			fos.write(i);
			
		}
		fis.close();
		fos.close();
		
	}

}
