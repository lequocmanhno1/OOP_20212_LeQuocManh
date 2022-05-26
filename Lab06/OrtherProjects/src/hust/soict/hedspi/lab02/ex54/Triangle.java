package hust.soict.hedspi.lab02.ex54;

import java.util.Scanner;

public class Triangle{
	    public static void printTriagle(int n)
	    {
	        for (int i=0; i<n; i++)
	        {
	            for (int j=n-i; j>1; j--)
	            {
	                // printing spaces
	                System.out.print(" ");
	            }
	            	//printing stars
	            for (int j=0; j<=2*i; j++)
	            {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    public static void main(String args[]){
	    	Scanner keyboard = new Scanner(System.in);
	    	System.out.print(" Input height of the triangle: ");
	    	int n = keyboard.nextInt();
	    	printTriagle(n);
	    	System.exit(0);
	    	keyboard.close();
		}
}