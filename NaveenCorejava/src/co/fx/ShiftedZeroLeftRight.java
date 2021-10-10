package co.fx;
/**
 * shift the zero left to right in the array */
import java.util.Arrays;

public class ShiftedZeroLeftRight {

	public static void main(String[] args) {
		int ar[]= {1,0,3,4,0,0,9,10};
		System.out.print(Arrays.toString(shiftZeroLeftToright(ar)));
	}
	public static int[] shiftZeroLeftToright(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int newArr[]=new int [arr.length];
		int count=0;
		for(int num:arr) {
			if(num !=0) {
				newArr[count]= num;
				count++;
			}
		}
		return newArr;	
	}
}
