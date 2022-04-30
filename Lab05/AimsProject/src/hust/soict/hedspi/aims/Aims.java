package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.CompactDisc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.test.disc.TestPassingPara;

public class Aims {
	public static void main(String[] args) {
		//Order anOrder = new Order();
		
		Order anOrder = Order.createOrder();
		Order o1 = Order.createOrder();
		Order o2 = Order.createOrder();
		Order o3 = Order.createOrder();
//		Order o4 = Order.createOrder();
//		Order o5 = Order.createOrder();
	
//		System.out.println(o4);
//		System.out.println(o5); // null
		
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("King The lie Lion kinh King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("George Lucas");
		dvd3.setLength(90);
		
		anOrder.addDigitalVideoDisc(dvd3);
		
		anOrder.removeDigitalVideoDisc(dvd1);
		
		CompactDisc cd1 = new CompactDisc("The Lion King CD");
		cd1.setCategory("Animation");
		cd1.setCost(19.95f);
		cd1.setDirector("Roger Allers");
		cd1.setLength(87);
		
		anOrder.addCompactDisc(cd1);
		
		CompactDisc cd2 = new CompactDisc("Star Wars CD");
		cd2.setCategory("Science Fiction");
		cd2.setCost(24.95f);
		cd2.setDirector("George Lucas");
		cd2.setLength(124);
		
		anOrder.addCompactDisc(cd2);
		
		CompactDisc cd3 = new CompactDisc("Aladdin CD");
		cd3.setCategory("Animation");
		cd3.setCost(18.99f);
		cd3.setDirector("George Lucas");
		cd3.setLength(90);
		
		anOrder.addCompactDisc(cd3);
		
		//anOrder.removeCompactDisc(cd1);
		
		CompactDisc cd4 = new CompactDisc("Aladdin CD 2");
		cd4.setCategory("Animation");
		cd4.setCost(18.99f);
		cd4.setDirector("George Lucas");
		cd4.setLength(90);
		
		anOrder.addCompactDisc(cd4);
		
		CompactDisc cd5 = new CompactDisc("Aladdin CD 3");
		cd5.setCategory("Animation");
		cd5.setCost(18.99f);
		cd5.setDirector("George Lucas");
		cd5.setLength(90);
		
		anOrder.addCompactDisc(cd5);
		
		
		CompactDisc cd6 = new CompactDisc("Aladdin CD 4");
		cd6.setCategory("Animation");
		cd6.setCost(18.99f);
		cd6.setDirector("George Lucas");
		cd6.setLength(90);
		
		anOrder.addCompactDisc(cd6);
		
		
		CompactDisc cd7 = new CompactDisc("Aladdin CD 5");
		cd7.setCategory("Animation");
		cd7.setCost(18.99f);
		cd7.setDirector("George Lucas");
		cd7.setLength(90);
		
		anOrder.addCompactDisc(cd7);
		
		
		CompactDisc cd8 = new CompactDisc("Aladdin CD 6");
		cd8.setCategory("Animation");
		cd8.setCost(18.99f);
		cd8.setDirector("George Lucas");
		cd8.setLength(90);
		
		anOrder.addCompactDisc(cd8);
		
		
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King4");
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King5");
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Lion King6");
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King7");
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Lion King8");
		
		DigitalVideoDisc dvdList[] = {dvd4,dvd5,dvd6,dvd7,dvd8};
		anOrder.addDigitalVideoDisc1(dvdList);
		anOrder.addDigitalVideoDisc2(dvd4,dvd5,dvd6,dvd7,dvd8);
		
		
		//test Passing parameter
//		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
//		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		
//		TestPassingPara test = new TestPassingPara();
//		
//		test.swap(jungleDVD, cinderellaDVD);
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//		System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
//		test.changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//		System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle()); 	
//		test.swapObject(jungleDVD, cinderellaDVD);
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//		System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
		
		
		//print Order
		MyDate date = new MyDate(1,4,2021);
		Order o4 = Order.createOrderWithDate(date);
		o4.addDigitalVideoDisc2(dvd1,dvd2,dvd3);
		//System.out.println(dvd2.printDVD());
		o4.printOrder();
		
		
		System.out.println(dvd1);
		
		
		System.out.print(dvd1.search("The Lion King"));
		
	}
}
