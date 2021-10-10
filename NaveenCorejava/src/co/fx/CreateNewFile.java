package co.fx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateNewFile {
	/**
	 * Create a file in java using 
	 * File 
	 * FileOutStream
	 * java NIO utils
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//using file class 
		String path="C:\\Users\\md\\Desktop\\sample.txt";
		File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("create the file in local system");
			}else {
				System.out.println("file is all ready exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//using scanner class 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file path");
		sc.nextLine();
		try {
			FileOutputStream fos = new FileOutputStream(file,true);
			System.out.println("Enter the content  -");
			String content = sc.nextLine();
			byte[] bytes = content.getBytes();
			fos.write(bytes);
			fos.close();
			System.out.println("Save the content - -");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Exceion occured");
		}
		//java nio package
		Path patLoc = Paths.get("C:\\Users\\md\\Desktop\\kha.txt");
		Path newPath = Files.createFile(patLoc);
		System.out.println("new file is created "+newPath);
		sc.close();
	}

}
