package hust.soict.hedspi.aims;
import java.util.Scanner;

import hust.soict.hedspi.aims.order.Order;

public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("-----------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("---------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
}
		
	
	public static void main(String[] args) {
		//Order anOrder = new Order();
		
		//Order anOrder = Order.createOrder();
		Order o1 = null;
		//Order o2 = Order.createOrder();
		//Order o3 = Order.createOrder();
//		Order o4 = Order.createOrder();
//		Order o5 = Order.createOrder();
	
//		System.out.println(o4);
//		System.out.println(o5); // null
		Scanner sc = new Scanner(System.in);		
		int choice;
		do {
			showMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				o1 = Order.createOrder();
				System.out.println("The Order is created");
				break;
			case 2: 
				int media_type;
				System.out.println("0.Book");
				System.out.println("1.Digital Video Disc");
				System.out.println("2.Compact Disc");
				System.out.println("Choose Media Type: ");
				media_type = sc.nextInt();
				o1.addMedia(media_type);
				break;
			case 3: 
				System.out.println("Input item ID: ");
				int item_id = sc.nextInt();
				o1.removeMedia(o1.getMediaItems(item_id-1)); //item_id lay khi in Order o case 4
				break;
			case 4:
				o1.printOrder();
				break;
			case 0:
				System.out.println("Exit.");
				System.exit(0);
			}
		} while (choice !=0);
		sc.close();
	}
}
