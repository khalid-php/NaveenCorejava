package co.fx;
/**
 * Joins the two Arrays
 * */
import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {

	public static void main(String[] args) {
		String[] batsman= {
				"Rohit","Sahwag","Rishabah"
		};
		String[] bowlers= {
			"Hardik","Bhuneswar","Chahal"	
		};
		Stream<String> sBat = Arrays.stream(batsman);
		Stream<String> sBow = Arrays.stream(bowlers);
		String[] full = Stream.concat(sBat,sBow).toArray(size->new String[size]);
		for(String s:full) {
			System.out.println(s);
		}
	}

}
