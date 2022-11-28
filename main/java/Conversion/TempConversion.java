package Conversion;

import java.text.DecimalFormat;

public class TempConversion {
	  
	
	    float Fahrenheit, Celsius;
	    private static final DecimalFormat decfor=new DecimalFormat("0.00");
	    public String FtoC(Float Fahrenheit)
	    { 
	    	 
	          Celsius  = ((Fahrenheit-32)*5)/9;  
	        
	          return decfor.format(Celsius);
	    }
	    public String CtoF(Float Celsius)
	    {
	    	Fahrenheit = (float) ((Celsius * 1.8) + 32);
	    	
	    	return decfor.format(Fahrenheit);
	    }
	      

}
