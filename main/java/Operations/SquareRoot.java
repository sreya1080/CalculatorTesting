package Operations;

public class SquareRoot {
	private static final double PRECISION = 0.000000000001;
   public static double sqrt(double X) {
		double sqrtroot=X/2; 
		double t;
		if(X<0)
			return -1;
		else
		{
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(X/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		return sqrtroot;  
	}
	}
}
