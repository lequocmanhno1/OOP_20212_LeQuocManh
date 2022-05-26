package hust.soict.hedspi.aims.order;
import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAXIMUM_ORDERED_ITEMS = 10;
	public static final int MAXIMUM_ORDERS = 5;
	public static final int MEDIA_DVD = 1;
	public static final int MEDIA_CD = 2;
	public static final int MEDIA_BOOK = 0;
	
	private List<Media> orderedItems = new ArrayList<Media>();
	
	private static int nbOrders = 0;

	private MyDate dateOrdered=null;

	private Order() {
		this.dateOrdered= new MyDate();
	}
	
	public Media createMedia(int media_type) {
		if (media_type == MEDIA_DVD) {
			return new DigitalVideoDisc().inputInformation();
		} else if (media_type == MEDIA_CD) {
			return new CompactDisc().inputInformation();
		} else if (media_type == MEDIA_BOOK) {
			return new Book().inputInformation();
		}
		return new Media().inputInformation();
	}
	
	public void addMedia(int media_type) {
		// check number of items here
		if (orderedItems.size() < MAXIMUM_ORDERED_ITEMS) {
		orderedItems.add(this.createMedia(media_type));
		} else {
			System.out.println("The order is full!");
		}
	}
	public void removeMedia(Media item) {
		for (int i = 0; i < orderedItems.size(); i++) {
			if (orderedItems.get(i) == item) {
				orderedItems.remove(item);
			}
		}
	}
	
	
	public void showOrderInformation() {
		for (int i =0; i<orderedItems.size();i++) {
			System.out.println(orderedItems.get(i));
		}
	}
	
	public static Order createOrder() {
		if (nbOrders >= MAXIMUM_ORDERS)
		{
			System.out.println("You have reached maximum orders");
			return null;
		}
		else {
			nbOrders ++;
			return new Order();
		}
	}
	
	private Order(MyDate dateOrdered) {
		super();
		this.dateOrdered = new MyDate();
	}

	
//	public static Order createOrderWithDate(MyDate date) {
//		if (nbOrders >= MAXIMUM_ORDERS)
//		{
//			System.out.println("You have reached maximum orders");
//			return null;
//		}
//		else {
//			nbOrders ++;
//			return new Order(date);
//		}
//	}
	


//	public DigitalVideoDisc getALuckyItem() {
//		int rand = (int)(Math.random() * (this.qtyDVD-1)) + 0;
//		System.out.println(this.qtyDVD);
//		System.out.println(rand);
//		DigitalVideoDisc freeDVD = new DigitalVideoDisc(this.listOfDVD[rand].getTitle());
//		 freeDVD.copyValue(this.listOfDVD[rand]);
//		 freeDVD.setCost(0);
//		 return freeDVD;
//	}
	
	Media luckyItem = null;
	public Media getALuckyItem() {
		int rand = (int)(Math.random() * (this.orderedItems.size()-1)) + 0;
		return this.orderedItems.get(rand);

	}
	
	
	public float totalCost() {
		float sum = 0;
		for (int i=0;i<orderedItems.size();i++) {
			if (this.orderedItems.get(i) != luckyItem) {
			sum += orderedItems.get(i).getCost();
			}
		}
		return sum;
		}
	
	
	public Media getMediaItems(int i) {
		return this.orderedItems.get(i);
	}
	
	public void printOrder() {
		System.out.println("***********************Order***********************");
		System.out.println("Date: "+ this.dateOrdered.print());
		System.out.println("Ordered Items:");
		
		luckyItem = this.getALuckyItem();
		luckyItem.setCost(0);
		//DigitalVideoDisc freeDVD = this.getALuckyItem();
		int count=1;
		
		for (int i = 0; i < orderedItems.size(); i++ ) {
			//if (this.orderedItems.get(i) != luckyItem) {
				System.out.println(count +". "+ orderedItems.get(i).toString());
				count++;
			//}
		}
		System.out.println("Free Items: " + luckyItem);
		
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
}
