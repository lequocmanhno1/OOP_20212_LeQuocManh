package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	//Copy value
	public void copyValue(DigitalVideoDisc dvd) {
		this.setCategory(dvd.getCategory());
		this.setCost(dvd.getCost());
		this.setLength(dvd.getLength());
		this.setDirector(dvd.getDirector());
		this.setTitle(dvd.getTitle());
	}
	
	public String printDVD() {
		return "DVD - "+ this.getTitle() + " - " + this.getCategory() + " - " 
					+ this.getDirector() + " -  " + this.getLength() +": " + this.getCost() + " $";
	}
	
	
	
	public String toString() {
		return "DVD:" + this.getTitle();
	}
	
	public boolean equals(Object o) {
		return ((DigitalVideoDisc)o).getTitle().equals(this.getTitle()); 
	}
	
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
