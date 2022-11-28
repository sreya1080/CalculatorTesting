package Operations;

public class Dividing {
	  public int div(int a, int b){
	    if(a==0)
	    	return 0;
	    else if(b==0)
	    	return -1;
	    else
	    {
	    	int a2=a/b;
	    	return a2;
	    }
	  }
	    public double div(double a, double b){
	        try{
	            double a2 = a/b;
	        }catch(ArithmeticException e){
	            System.out.println("Divide by zero error");
	            return Integer.MIN_VALUE;
	        }
	        return a/b;
	    }
	    

}
