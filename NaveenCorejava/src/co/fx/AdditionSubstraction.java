package co.fx;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionSubstraction {
	/**
	 * WAP The Matrix Addition and substraction */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows:- ");
		int rows = sc.nextInt();
		System.out.println("Enter the Columns:-");
		int cols=sc.nextInt();
		
		int matrix1[][]=new int[rows][cols];
		int matrix2[][]=new int [rows][cols];
		int resultMatrix[][]=new int [rows][cols];
		int subMarix[][]=new int[rows][cols];
		System.out.println("Enter the Element first Matrix1:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Element second Matrix2 :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		//print the first matrix1
		System.out.println("Print the first matrix");
		for(int[] x:matrix1) {
			for(int r:x) {
				System.out.print(r +"\t");
			}
			System.out.println();
		}
		//print the second matrix2
		System.out.println("Second Matrix ---");
		for(int[]y :matrix2) {
			System.out.println(Arrays.toString(y));
		}
		
		//sum of the matrix----
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		//print the matrix result
		System.out.println("Sum of two matrix");
		for(int[]z:resultMatrix) {
			for(int x:z) {
				System.out.print(x+"\t");
			}
			System.out.println();
		}
		
		System.out.println("substraction the matrix--");
		//substraction the two matrix
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				 subMarix[i][j]=matrix2[i][j]-matrix1[i][j];
			}
		}
		//print the matrix 
		for(int[] m:subMarix) {
			System.out.println(Arrays.toString(m));
		}
		
	}

}
