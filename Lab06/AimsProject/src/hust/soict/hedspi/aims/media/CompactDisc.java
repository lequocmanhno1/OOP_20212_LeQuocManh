package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class CompactDisc extends Media{
	//private String ID;
	private String artist;
	private String director;
	private int length;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
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
	
	public CompactDisc() {
		
	}
	
	public CompactDisc(String title, String category, String artist , String director, int length, float cost) {
		super(title,category,cost);
		this.artist=artist;
		this.director=director;
		this.length=length;
	}
	
	public Media inputInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("CD Title: ");
		String title = sc.nextLine();
		System.out.println("CD Category: ");
		String category = sc.nextLine();
		System.out.println("CD Artist: ");
		String artist = sc.nextLine();
		System.out.println("CD Director: ");
		String director = sc.nextLine();
		System.out.println("CD Length: ");
		int length = Integer.parseInt(sc.nextLine());
		System.out.println("CD Cost: ");
		float cost = Float.parseFloat(sc.nextLine());
		sc.close();
		return new CompactDisc(title, category, artist ,director, length, cost);
	}
	
	public String toString() {
		return "CD: " + super.toString() + " - Artist: " + this.artist + " - Director: " + this.director + " - Length: " + this.length;
	}
	
}
