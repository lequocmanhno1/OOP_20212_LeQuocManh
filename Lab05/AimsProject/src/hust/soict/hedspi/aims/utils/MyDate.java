package hust.soict.hedspi.aims.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		super();
		LocalDate myObj = LocalDate.now();
		this.year = myObj.getYear();
		this.month = myObj.getMonthValue();
		this.day = myObj.getDayOfMonth();
	}

	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public MyDate(String text) {
		
		Date date=null;
		try {
			text = text.replaceAll("(?<=\\d)(st|nd|rd|th)", "");
			date = new SimpleDateFormat("MMMM dd yyyy")
				    .parse(text);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.day = date.getDate();
		this.month = date.getMonth()+1; //getMonth count from 0
		this.year = date.getYear()+1900; //getYear count from 1900
	}

	private boolean checkLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		} 
		return false;
	}
	
	private boolean checkValidDate(int day) {
		if ((day < 1 ) || (day > 31)) {
			return false;
		}
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 30) {
				return false;
			}
			break;
		case 2:
			if (day > 28 && checkLeapYear(year) == false) {
				return false;
			} else if (day > 29 && checkLeapYear(year) == true) {
				return false;
			}
			break;
		}
		return true;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
	    if (checkValidDate(day) == true) {
	    	this.day = day;
	    	return;
	    }
	    System.out.println("Invalid Date");
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("Invalid month");
			return;
		} 
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 0) {
			System.out.println("Invalid year");
			return;
		}
		this.year = year;
	}
	
	public MyDate accept() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Input date: ");
		String date = inp.nextLine();
		MyDate inputDate = new MyDate(date);
		inp.close();
		this.year = inputDate.getYear();
		this.month = inputDate.getMonth();
		this.day = inputDate.getDay();
		return this;
	}
	
	public String print() {
		if (this.day == 0 || this.month == 0 || this.year ==0) {
			return "Invalid Date Object";
		}
		
		String SMonth = strMonth[this.month];
		String SDay = this.day + suffixes[this.day];
		
		return SMonth +" " + SDay  + " " + this.year;
	}
		
	public String printAnother1() {
		if (this.day == 0 || this.month == 0 || this.year ==0) {
			return "Invalid Date Object";
		}
		return this.year +"/" + this.month  + "/" + this.day;
	}
	
	public void printAnother2() {
		if (this.day == 0 || this.month == 0 || this.year ==0) {
			System.out.println("Invalid Date Object");
		}
		System.out.printf("%02d-%02d-%d\n", this.month, this.day, this.year);
	}
	
	
	public void printAnother3() {
		if (this.day == 0 || this.month == 0 || this.year ==0) {
			System.out.println("Invalid Date Object");
		}
		System.out.printf("%d-%02d-%02d\n", this.year, this.month, this.day);
	}
	
	
	static String[] suffixes =
			  //    0     1     2     3     4     5     6     7     8     9
			     { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th",
			  //    10    11    12    13    14    15    16    17    18    19
			       "th", "th", "th", "th", "th", "th", "th", "th", "th", "th",
			  //    20    21    22    23    24    25    26    27    28    29
			       "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th",
			  //    30    31
			       "th", "st" };
	
	private String strMonth[] = {"Invalid Month","January","February","March","April",
				"May","June","July","August","September","October","November","December"};
	
	private String strDayInMonth[] =  new String[]{"Invalid Date","first", "second", "third", "fourth", "fifth", "sixth", "seventh", 
			"eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", 
			"fifteen", "sixteen", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first", 
			"twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh",
			"twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first"};
	
	private List<String> namestrMonth = new ArrayList<>(Arrays.asList(strMonth));
	private List<String> namestrDayInMonth = new ArrayList<>(Arrays.asList(strDayInMonth));
	
	private int intMonth(String month) {
		int index = -1;
        for (int i = 1; i< strMonth.length;i++) {
        	index = namestrMonth.indexOf(month);
        	if (index > 0) break;
        		}
		if (index <= 0) return 0;
		return index;
	}
	private int intDay(String day) {
		int index = -1;
        for (int i = 1; i< strDayInMonth.length;i++) {
        	index = namestrDayInMonth.indexOf(day);
        	if (index > 0) break;
        		}
		if (index <= 0) return 0;
		return index;
	}
	
	private int intYear(String year) {
		String[] strYear = year.split(" ");
		return Integer.parseInt(WordsToNumbersUtil.convertTextualNumbersInDocument(strYear[0]) +""
				+ WordsToNumbersUtil.convertTextualNumbersInDocument(strYear[1]));
		
	}
	
	public MyDate(String day, String month, String year) {
		int IDay = intDay(day);
		int IMonth = intMonth(month);
		int IYear = intYear(year);
		setYear(IYear);
		setMonth(IMonth);
		setDay(IDay);
	}
}





