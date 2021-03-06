package hust.soict.hedspi.aims.disc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Media;

public class CompactDisc extends Disc{
	//private String ID;
	private String artist;
	
	private List<Track> listOfTrack = new ArrayList<Track>();
	
	
	
	
	
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public CompactDisc() {
		
	}
	
	public CompactDisc(String title, String category, String artist , String director, int length, float cost) {
		super(title,category,cost);
		this.artist=artist;
		this.director=director;
		this.length=length;
	}
	
	public void addTrack(String title, int length) {
		listOfTrack.add(new Track(title, length));
	}
	
	public void addTrack(Track t) {
		listOfTrack.add(t);
	}
	
	public void removeTrack(Track t) {
		listOfTrack.remove(t);
	}
	
	public int getLength() {
		int  length = 0; // sua toan bo lai thanh long
		for (int i =0; i< listOfTrack.size(); i++) {
			length += listOfTrack.get(i).getLength();
		}
		this.
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
