
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class DateUtils {
	
	public static int compareDate(MyDate d1, MyDate d2) { 
		Date myDate1 = new Date(d1.getYear(), d1.getMonth(), d1.getDay());
		Date myDate2 = new Date (d2.getYear(), d2.getMonth(), d2.getDay());
		return myDate1.compareTo(myDate2); // return 1 if date 1 > date 2
	}	
	
	public static void sortDate(MyDate [] md) {
		Arrays.sort(md, new Comparator<MyDate>() {
		    @Override
		    public int compare(MyDate o1, MyDate o2) {
		        return compareDate(o1,o2);
		    }
		});
	}

}
