
public class CompactDisc {
	//private String ID;
	private String title;
	private String category;
	private String artist;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public CompactDisc(String title) {
		super();
		this.title = title;
	}
	
	public String printCD() {
		return "CD - "+ this.getTitle() + " - " + this.getCategory() + " - " + this.getArtist() 
					+ this.getDirector() + " -  " + this.getLength() +": " + this.getCost() + " $";
	}
	
}
