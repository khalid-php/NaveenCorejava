package co.fx;
/**Find the missing number  in the given array */
public class FindTheMissingNumber {

	public static void main(String[] args) {
		int num[]= {1,5,3,4,6,7,8,9,10};
		int output = findMissingNum(num,10);
		System.out.println(output);
	}
	public static int findMissingNum(int[] num,int totalCount) {
		int expsum= totalCount * (totalCount+1)/2;
		int actualSum=0;
		for(int i:num) {
			actualSum+=i;
		}
		return expsum - actualSum;
	}
}
