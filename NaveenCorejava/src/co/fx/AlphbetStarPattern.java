package co.fx;

public class AlphbetStarPattern {

	public static void main(String[] args) {
		starPatterndis();
	}
	public static void starPatterndis() {
		int alph=65;
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				
				System.out.print((char)alph +" ");
			}
			System.out.println();
			alph++;
		}
	}
}
