package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Playable;

public class Track implements Playable {
	private String title;
	private int length;
	
	public Trach() {String title, int length}{
		this.title= title;
		this.length = length;
	}
	
	public String toString() {
		return "Track: " + this.title + "- Length: " + this.length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
}
