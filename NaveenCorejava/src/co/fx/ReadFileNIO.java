package co.fx;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileNIO {
	/**
	 * Read the file from nio or end of file write all element*/
	public static void main(String[] args) {
		String path="C:\\Users\\md\\Desktop\\sample.txt";
		try {
			List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
			Iterator<String> itr = lines.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
