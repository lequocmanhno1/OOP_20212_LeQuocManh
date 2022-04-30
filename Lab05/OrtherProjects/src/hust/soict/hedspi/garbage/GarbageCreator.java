package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
	public static void main (String[] args) {
		String s ="";
		long start = System.currentTimeMillis();
		File inp = new File("C:\\Users\\leemain\\Desktop\\Commit\\OOP_20212_LeQuocManh\\Lab05\\OrtherProjects\\src\\hust\\soict\\hedspi\\garbage\\sample-2mb-text-file.txt");
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(inp);
			int count = 1;
			while(fileScanner.hasNext()) {
					s=s+fileScanner.next()+" ";
					count++;
			}
			start = System.currentTimeMillis() - start;
			fileScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot open file!");
			e.printStackTrace();
		}
		System.out.println(s);
		System.out.println("Time:" + start + " miliseconds.");
	}
}
