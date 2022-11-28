package Geometry;

public class Area {
	public static double TriangleArea(double h, double b)
	    {
	        if(h<0 && b<0)
	        	return -1;
	        else if(h<0)
	        	return 0;
	        else if(b<0)
	        	return 0;
	        else
			 return Math.round( ((h * b) / 2)*100 )/100;
	    }
	 
	public static double RectangleArea(double h, double b)
	    {
	        
	    
	        return Math.round( (h * b)*100 )/100 ;
	    }
	public static double CircleArea(double r)
	 {
		 return Math.round( (3.14 * r * r) *100 )/100;
	 }

}
