
public class DateTest {
	public static void main(String[] args) {
//		MyDate date1 = new MyDate();
//		date1.print();
//		
		MyDate date2 = new MyDate(30,11,2022);
//		date2.print();
//		
		MyDate date3 = new MyDate("December 1st 2022");
//		date3.print();
//		
//		MyDate date4 = new MyDate().accept();
//		date4.print();
//		
		
		//System.out.println(WordsToNumbersUtil.convertTextualNumbersInDocument("nineteen ninety nine"));
		MyDate date4 = new MyDate("second", "April", "twenty nineteen");
		System.out.println(date4.print()); 			// February 29th 2020
		System.out.println(date4.printAnother1()); 	// d/M/yyyy
		date4.printAnother2();						// yyyy-MM-dd
		date4.printAnother3();						// mm-dd-yyyy
		
		System.out.println(DateUtils.compareDate(date3, date4));
		
		MyDate[] Date = {date2,date3, date4};
		
		DateUtils.sortDate(Date);
		
		for (int i = 0; i < Date.length; i++) {
			System.out.println(Date[i].print());
		}
		
	}
}
