package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class Media {
	//private int id;
	private String title;
	private String category;
	private float cost;
	
	public Media() {
		super();
		System.out.print("Media()");
	}
	
	
//	public Media(int id, String title, String category, float cost) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.category = category;
//		this.cost = cost;
//	}
	

	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	
	public Media(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	
	public Media(String title) {
		super();
		this.title = title;
	}


	public Media inputInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Media Title: ");
		String title = sc.nextLine();
		System.out.println("Media Category: ");
		String category = sc.nextLine();
		System.out.println("Media Cost: ");
		float cost = Float.parseFloat(sc.nextLine());
		sc.close();
		return new Media(title, category, cost);
	}
	
	public String toString() {
		return "Title: " + this.title + " - Category: " + this.category + " - Price: " + this.cost;
	}
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	

}
