package co.fx;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
	/**
	 * @apiNote W A P to product of two matrix */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rows first Matrix :- ");
		int rowsInFirst = sc.nextInt();
		System.out.println("Enter the colums first matrix or second rows:-");
		int colsInFirstAndSecondRows = sc.nextInt();
		System.out.println("Enter the colums second matrix :-");
		int colsInSecond = sc.nextInt();
		
		
		int matrix1[][]=new int[rowsInFirst][colsInFirstAndSecondRows];
		int matrix2[][]=new int[colsInFirstAndSecondRows][colsInSecond];
		int product1[][]=new int[rowsInFirst][colsInSecond];
		System.out.println("Enter the matrix1 element ");
		for(int i=0;i<rowsInFirst;i++) {
			for(int j=0;j<colsInFirstAndSecondRows;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the matrix2 element: ");
		for(int i=0;i<colsInFirstAndSecondRows;i++) {
			for(int j=0;j<colsInSecond;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Print the first Matrix--");
		for(int[] x:matrix1) {
			System.out.println(Arrays.toString(x));
		}
		
		System.out.println("Print the second matrix:--");
		for(int[] y:matrix2) {
			System.out.println(Arrays.toString(y));
		}
		
		//get the product of two matrix
		for(int i=0;i<rowsInFirst;i++) {
			for(int j=0;j<colsInSecond;j++) {
				for(int k=0;k<colsInFirstAndSecondRows;k++) {
					product1[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		//print the matrix product
		System.out.println("Print the production of the matrix");
		for(int[] z:product1) {
			System.out.println(Arrays.toString(z));
		}
		sc.close();
	}

}
