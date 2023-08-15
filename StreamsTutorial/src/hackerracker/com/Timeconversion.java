package hackerracker.com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timeconversion {

	public static void conversion(String s) throws ParseException {
		DateFormat dateformat = new SimpleDateFormat("hh:mm:ssaa");	
		DateFormat format = new SimpleDateFormat("HH:mm:ss");	
		Date time = null;	
		String output = "";	
		time = dateformat.parse(s);
		output = format.format(time);
		System.out.println(output);
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Timeconversion.conversion("07:05:45PM");
		
		

	}

}
