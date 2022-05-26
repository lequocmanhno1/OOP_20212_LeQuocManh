package hust.soict.hedspi.lab02.ex57;

import java.util.Scanner;

public class Add2Matrix {
	public static void main(String args[]){
		int row, col,i,j;
		Scanner keyboard = new Scanner(System.in);
 
		System.out.println("Enter the number of rows");
		row = keyboard.nextInt();
 
		System.out.println("Enter the number columns");
		col = keyboard.nextInt();
 
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];
 
		System.out.println("Enter the elements of the first matrix");
		i=0;
		do
		{ 
			j=0;
			do
			{
				mat1[i][j] = keyboard.nextInt();
				j++;
			}while(j < col);
			i++;
 
		} while ( i < row);
		System.out.println("Enter the elements of the second matrix");
 
		i=0;
		do
		{ 
			j=0;
			do
			{
				mat2[i][j] = keyboard.nextInt();
				j++;
			}while(j < col);
			i++;
 
		} while ( i < row);
 
		i=0;
		do
		{ 
			j=0;
			do
			{
 
				res[i][j] = mat1[i][j] + mat2[i][j] ; 
				j++;
			}while(j < col);
			i++;
 
		}while ( i < row);
 
 
		System.out.println("Sum of matrices: ");
		i=0;
		do
		{ 
			j=0;
			do
			{
				System.out.print(res[i][j]+"\t");
				j++;
			}while(j < col);
			System.out.println();
			i++;
 
		}while(i< row);
		keyboard.close();
	}
}