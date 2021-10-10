package co.fx;

import java.io.File;
import java.util.Arrays;
/**
 * Print the all Directory or file structure and details */
public class PrintDirectory {

	public static void main(String[] args) {
		String path="C:\\";
		File file = new File(path);
		File[] listFiles = file.listFiles();
		Arrays.sort(listFiles);
		for(File e:listFiles) {
			if(e.isFile()) {
				System.out.println("File : is "+e.getName());
			} else if(e.isDirectory()) {
				System.out.println("Directory : is "+e.getName());
			}else {
				System.out.println(" Unkown No ");
			}
		}
	}

}
