package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingPara {
	public void swap(DigitalVideoDisc d1, DigitalVideoDisc d2) {
		DigitalVideoDisc d = d1;
		d1 = d2;
		d2 =d;
	}
	
	public void changeTitle(DigitalVideoDisc d, String newTitle) {
		d.setTitle(newTitle);
	}
	
	
	public void swapObject(DigitalVideoDisc d1, DigitalVideoDisc d2) {
		DigitalVideoDisc d = new DigitalVideoDisc(null);
		d.copyValue(d1);
		d1.copyValue(d2);
		d2.copyValue(d);
	}
}
