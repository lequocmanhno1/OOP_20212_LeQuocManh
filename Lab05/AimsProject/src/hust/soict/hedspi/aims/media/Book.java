package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}
	
	public Book(String title, String category, float cost) {
		super(title,category, cost);
	}

	
	public void addAuthor(String author) {
		this.authors.add(author);	
	}
	
	public void addAuthor(List<String> authors) {
		this.authors.addAll(authors);
	}
	
	public List<String> getAuthors(){
		return this.authors;
	}
	
	public void removeAuthor(String author) {
		this.authors.remove(author);
	}
	
	public String toString() {
		return "Book: " + super.toString() + " - Authors: " + this.authors.toString();
	}
	
	public Book(String title, String category, List<String> authors, float cost) {
		super(title, category, cost);
		this.authors.addAll(authors);
	};
	
	public Media inputInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Book Title: ");
		String title = sc.nextLine();
		System.out.println("Book Category: ");
		String category = sc.nextLine();
		System.out.println("Book Authors: ");
		String author = sc.nextLine();
	    authors= Arrays.asList(author.split(","));
		System.out.println("Book Cost: ");
		float cost = Float.parseFloat(sc.nextLine());
		sc.close();
		return new Book(title, category , authors, cost);
	}
	
	
	
	
}
