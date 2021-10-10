package co.fx;
	/**
	 * Find the leader element in the array
	 * */
public class LeaderElementInArray {
	public static void main(String[] args) {
		int num[] = {92,7,12,9,8,3};
		getLeaderElement(num);
		int num1[] = {92,7,12,9,8,14};
		getLeaderElement(num1);
	}
	public static void getLeaderElement(int num[]) {
		if(num.length==1) {
			System.out.println(num[0]);
			return;
		}
		if(num.length==0) {
			System.out.println("empty array");
			return;
		}
		int max=num[num.length-1];
		System.out.println(max);
		for(int i=num.length-2;i>=0;i--) {
			if(num[i]>max) {
				System.out.print(num[i]+" ");
				max=num[i];
			}
		}
	}
}
