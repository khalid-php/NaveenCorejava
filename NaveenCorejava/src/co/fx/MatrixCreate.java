package co.fx;

import java.util.Arrays;
import java.util.Scanner;

/**
	 * Creating the matrix or 2d arrays using user input*/
public class MatrixCreate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows ");
		int rows = sc.nextInt();
		System.out.println("Enter cloumns");
		int cols = sc.nextInt();
		int data[][]=new int[rows][cols];
		System.out.println("Enter the Matrix Rows  Element" ); 
			for(int i=0;i<rows;i++) {
				System.out.println("Enter cols Element ");
				for(int j=0;j<cols;j++) {
					data[i][j]=sc.nextInt();
				}
			}
			//print the data
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<cols;j++) {
//					System.out.print(data[i][j] +"");
//				}
//			}
			//using for each loop
			for(int[] r:data) {
				for(int x:r) {
					System.out.print(x+" ");
				}
				System.out.println();
			}
			//deepto string();
			System.out.println(Arrays.deepToString(data));
			
			Arrays.stream(data).forEach((e)->{
				Arrays.stream(e).forEach((j)->System.out.print(j+" "));
				System.out.println();
			});
			sc.close();
		}
	  
	}

