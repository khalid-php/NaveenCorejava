package co.fx;
/**
 * @apiNote  the star pattern 
 * look like-
 * 	B 
	C C 
	D D D 
	E E E E */
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
