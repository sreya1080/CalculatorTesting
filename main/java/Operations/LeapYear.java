package Operations;

public class LeapYear {

	public static boolean isLeap(int year)
	{   boolean leap=true;
		 if (year % 4 == 0) {

		    
		      if (year % 100 == 0) {

		     
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;

		  return leap;
		
	}
}
