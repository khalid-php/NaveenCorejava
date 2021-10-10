package co.fx;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
	/**
	 *W A P to  Matrix Transponse */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows:- ");
		int rows = sc.nextInt();
		System.out.println("Enter the column:-");
		int cols = sc.nextInt();
		int matrix1[][]=new int[rows][cols];
		int transpose[][]=new int[cols][rows];
		System.out.println("Enter the first matrix elememt:-");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print the first matrix ");
		for(int[] m:matrix1) {
			System.out.println(Arrays.toString(m));
		}
		System.out.println("Tanspose the matrix --"); 
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transpose[j][i]=matrix1[i][j];
			}
		}
		for(int[] n:transpose) {
			System.out.println(Arrays.toString(n));
		}
		sc.close();
	}

}
