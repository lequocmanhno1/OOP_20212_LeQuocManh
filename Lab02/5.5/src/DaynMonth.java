import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class DaynMonth{

    
  public static void main(String[] strings) {

        String[] intMonth = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] strMonth = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] abbMonth = new String[]{"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July" , "Aug.", "Sept.", "Oct." , "Nov.", "Dec."};
        String[] threeltMonth = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul" , "Aug", "Sep", "Oct" , "Nov", "Dec"};
        
        List<String> nameintMonth = new ArrayList<>(Arrays.asList(intMonth));
        List<String> namestrMonth = new ArrayList<>(Arrays.asList(strMonth));
        List<String> nameabbMonth = new ArrayList<>(Arrays.asList(abbMonth));
        List<String> namethreeltMonth = new ArrayList<>(Arrays.asList(threeltMonth));
        
        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        int index = -1;
        do{
        String month = JOptionPane.showInputDialog(null, "Input a valid month: " , "INPUT MONTH", JOptionPane.INFORMATION_MESSAGE);
        if (month == null) {System.exit(0);}
        index =	nameintMonth.indexOf(month);
        if (index<0) {
            index = namestrMonth.indexOf(month);
            if (index<0) { 
                index = nameabbMonth.indexOf(month);
                if (index<0) {
                    index = namethreeltMonth.indexOf(month);
                }
            }
        }
        } while (index<0);
        
        int year =0;
        
        while(year <=0) {
        	try {
        		String stryear = JOptionPane.showInputDialog(null, "Input a valid year: " , "INPUT YEARS", JOptionPane.INFORMATION_MESSAGE);
        		if (stryear == null) {System.exit(0);}
        		year = Integer.parseInt(stryear);
        	} catch(Exception e) {
        		JOptionPane.showMessageDialog(null, "Please input a valid year in number!");
        		continue;
        	}
        }
        
        switch (index) {
            case 0:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 1:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 2:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 3:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 4:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 5:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 6:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 7:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 9:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 10:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 11:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        JOptionPane.showMessageDialog(null, MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}