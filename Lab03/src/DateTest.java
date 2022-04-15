
public class DateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		date1.print();
		
		MyDate date2 = new MyDate(31,11,2022);
		date2.print();
		
		MyDate date3 = new MyDate("December 01st 2022");
		date3.print();
		
		MyDate date4 = new MyDate().accept();
		date4.print();
	}
}
