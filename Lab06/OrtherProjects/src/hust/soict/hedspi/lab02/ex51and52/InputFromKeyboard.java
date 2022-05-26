package hust.soict.hedspi.lab02.ex51and52;

import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		String strAge = keyboard.nextLine();
		int age = Integer.parseInt(strAge);
		System.out.println("How tall are you (m)?");
		String strHeight = keyboard.nextLine();
		Double height = Double.parseDouble(strHeight);
		
		System.out.println("Mrs/Ms. " + strName + ", " + age + " years old. "
				 			+ "Your height is " + height + ".");
		keyboard.close();
	}
}
