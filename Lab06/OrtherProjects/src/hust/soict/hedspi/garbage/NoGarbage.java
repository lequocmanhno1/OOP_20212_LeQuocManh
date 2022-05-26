package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoGarbage {
	public static void main (String[] args) {
		StringBuffer stringBuffer=new StringBuffer("1");
		long start = System.currentTimeMillis();
		File inp = new File("C:\\Users\\leemain\\Desktop\\Commit\\OOP_20212_LeQuocManh\\Lab05\\OrtherProjects\\src\\hust\\soict\\hedspi\\garbage\\sample-2mb-text-file.txt");
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(inp);
			int count = 1;
			while(fileScanner.hasNext()) {
				stringBuffer.append(fileScanner.next()).append(" ");
				count++;
			}
			start = System.currentTimeMillis() - start;
			fileScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot open file!");
			e.printStackTrace();
		}
		String string=stringBuffer.toString();
		System.out.println(string);
		System.out.println("Time:" + start + " miliseconds.");
	}
}
