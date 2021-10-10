package co.fx;
/**Find the count in the given the file*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCount {
	static String path="C:\\Users\\md\\Desktop\\sample.txt";
	public static void main(String[] args) {
	Map<String, Integer> wordMap = new HashMap<String,Integer>();
	BufferedReader bufferedReader=null;
	try {
		bufferedReader=new BufferedReader(new FileReader(path));
		String currentLine = bufferedReader.readLine();
		while(currentLine !=null) {
			String[] words = currentLine.toLowerCase().split(" ");
			for(String word:words) {
				if(!word.isEmpty()) {
					if(wordMap.containsKey(word)) {
						wordMap.put(word,wordMap.get(word)+1);
					}else {
						wordMap.put(word,1);
					}
				}
			}
			currentLine=bufferedReader.readLine();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	wordMap.forEach((k,v)->System.out.println(k+" : "+v));	
	
	//using the stream api
	Map<String,Integer> maxcount=new HashMap<String,Integer>();
	wordMap.entrySet()
		.stream().
			filter(entry->entry.
				getValue()==Collections.
					max(wordMap.values())).
						forEach(e->maxcount.put(e.getKey(),e.getValue()));
	System.out.println(maxcount);
	
	}

}
