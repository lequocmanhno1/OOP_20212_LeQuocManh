package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.disc.CompactDisc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAXIMUM_ORDERED_ITEMS = 10;
	public static final int MAXIMUM_ORDERS = 5;
	
	private DigitalVideoDisc listOfDVD[] = new DigitalVideoDisc[MAXIMUM_ORDERED_ITEMS];
	private CompactDisc	listOfCD[] = new CompactDisc[MAXIMUM_ORDERED_ITEMS];
	
	private static int nbOrders = 0;
	private int qtyDVD=0;
	private int qtyCD=0;
	private MyDate dateOrdered=null;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		listOfDVD[qtyDVD] = disc;
		qtyDVD++;
		System.out.println("The disc "+ disc.getTitle() + " has been added");
		if ((qtyDVD+qtyCD) == MAXIMUM_ORDERED_ITEMS) {
			System.out.println("the "+ disc.getTitle() +" that could not be added the item\r\n"
					+ "quantity has reached its limit.\r\n");
		}
	}
	
	public void addDigitalVideoDisc1(DigitalVideoDisc [] dvdList) {
		for (int i =0; i< dvdList.length; i++) {
			if ((qtyDVD+qtyCD) == MAXIMUM_ORDERED_ITEMS) {
				System.out.println("The order is almost full");
				break;
			}
			addDigitalVideoDisc(dvdList[i]);
			
		}
	}
	
	public void addDigitalVideoDisc2(DigitalVideoDisc ...dvdList) {
		for (int i =0; i< dvdList.length; i++) {
			if ((qtyDVD+qtyCD) == MAXIMUM_ORDERED_ITEMS) {
				System.out.println("The order is almost full");
				break;
			}
			addDigitalVideoDisc(dvdList[i]);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i =0; i < qtyDVD; i++) {
			if (listOfDVD[i] == disc) {
				   for(int j = i ; j < listOfDVD.length -1; j++){
					   listOfDVD[j] = listOfDVD[j + 1];
				      }
			};
		}
		qtyDVD--;
		System.out.println("The disc "+ disc.getTitle() + " has been added");
	}  
	
	public void addCompactDisc(CompactDisc disc) {
		listOfCD[qtyCD] = disc;
		qtyCD++;
		System.out.println("The disc "+ disc.getTitle() + " has been added");
		if ((qtyDVD+qtyCD) == MAXIMUM_ORDERED_ITEMS) {
			System.out.println("the "+ disc.getTitle() +" that could not be added the item\r\n"
					+ "quantity has reached its limit.\r\n");
		}
	}
	
	public void removeCompactDisc(CompactDisc disc) {
		for (int i =0; i < qtyCD; i++) {
			if (listOfCD[i] == disc) {
				   for(int j = i ; j < listOfCD.length -1; j++){
					   listOfCD[j] = listOfCD[j + 1];
				      }
			};
		}
		qtyCD--;
		System.out.println("The disc "+ disc.getTitle() + " has been added");
	}  
	
	private Order() {
		
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
		this.dateOrdered = dateOrdered;
	}

	
	public static Order createOrderWithDate(MyDate date) {
		if (nbOrders >= MAXIMUM_ORDERS)
		{
			System.out.println("You have reached maximum orders");
			return null;
		}
		else {
			nbOrders ++;
			return new Order(date);
		}
	}
	
	public float totalCost() {
		float sum = 0;
		for (int i =0; i < qtyDVD; i++) {
			sum += listOfDVD[i].getCost();
		}
		for (int i =0; i < qtyCD; i++) {
			sum += listOfCD[i].getCost();
		}
		return sum;
		}

	public DigitalVideoDisc getALuckyItem() {
		int rand = (int)(Math.random() * (this.qtyDVD-1)) + 0;
		System.out.println(this.qtyDVD);
		System.out.println(rand);
		DigitalVideoDisc freeDVD = new DigitalVideoDisc(this.listOfDVD[rand].getTitle());
		 freeDVD.copyValue(this.listOfDVD[rand]);
		 freeDVD.setCost(0);
		 return freeDVD;
				
	}
	
	
	
	public void printOrder() {
		System.out.println("***********************Order***********************");
		System.out.println("Date: "+ this.dateOrdered.print());
		System.out.println("Ordered Items:");
		
		
		DigitalVideoDisc freeDVD = this.getALuckyItem();
		int count=1;
		for (int i = 0; i < qtyDVD; i++ ) {
			if (freeDVD.equals(this.listOfDVD[i])==false) { 
			System.out.println(count +". "+ this.listOfDVD[i].printDVD());
			count++;
			}
		}
		for (int i = 0; i < qtyCD; i++ ) {
			System.out.println(count +". "+ this.listOfCD[i].printCD());
			count++;
		}
		
		System.out.println("Free Items: " + freeDVD.printDVD());
		
		
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
}
