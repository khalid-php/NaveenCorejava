package co.fx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The total count of the Character, word, line  in the given file
 * @parms*/
public class CountCharWordLine {
	static String  path="C:\\Users\\md\\Desktop\\sample.txt";
	public static void main(String[] args) {
		int  charCount=0;
		int wordCount=0;
		int lineCount=0;
		BufferedReader bufferedReader=null;
		try {
			bufferedReader=new BufferedReader(new FileReader(path));
			String currentLine=bufferedReader.readLine();
			while(currentLine!=null) {
				lineCount++;
				//words
				String[] words = currentLine.split(" ");
				wordCount=wordCount+words.length;
				
				//line
				for(String word:words) {
					charCount=charCount+word.length();
				}
				currentLine=bufferedReader.readLine();
			}
			System.out.println("line no-"+lineCount);
			System.out.println("word count "+wordCount);
			System.out.println("character count "+charCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
