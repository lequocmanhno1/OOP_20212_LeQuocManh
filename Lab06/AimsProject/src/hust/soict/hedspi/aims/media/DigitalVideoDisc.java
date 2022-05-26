package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class DigitalVideoDisc extends Media{

	private String director;
	private int length;

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public DigitalVideoDisc(){
		
	}

	public DigitalVideoDisc(String title){
		super(title);
	}

	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
	}

	
	public DigitalVideoDisc(String director, int length) {
		super();
		this.director = director;
		this.length = length;
	}
	
	public DigitalVideoDisc(String title, String category, String director,  float cost, int length) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	public Media inputInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("DVD Title: ");
		String title = sc.nextLine();
		System.out.println("DVD Category: ");
		String category = sc.nextLine();
		System.out.println("DVD Director: ");
		String director = sc.nextLine();
		System.out.println("DVD length: ");
		int length = Integer.parseInt(sc.nextLine());
		System.out.println("DVD Cost: ");
		float cost = Float.parseFloat(sc.nextLine());
		sc.close();
		return new DigitalVideoDisc(title, category, director, length, cost);
		
	}
	
	
	public String toString() {
		return "DVD: " + super.toString() + " - Director: " + this.director + " - Length: " + this.length;
	}
	
	
	//Copy value
//	public void copyValue(DigitalVideoDisc dvd) {
//		this.setCategory(dvd.getCategory());
//		this.setCost(dvd.getCost());
//		this.setLength(dvd.getLength());
//		this.setDirector(dvd.getDirector());
//		this.setTitle(dvd.getTitle());
//	}
	
//	public boolean equals(Object o) {
//		return ((DigitalVideoDisc)o).getTitle().equals(this.getTitle()); 
//	}
	
	public boolean search(String title) {
		String [] tokens = title.split(" ");
		
		int count =0;
		for (int i = 0;i<tokens.length;i++) {
			//System.out.println(this.getTitle().contains(tokens[i]));
			if (this.getTitle().contains(tokens[i])) {
				count++;
			}
		}
		//System.out.println(count);
		if (count >= tokens.length) return true;
		return false;
	}
	
	
}
