package Operations;

public class Multiplications {
	 public int multiply(int a, int b){
	        if((long)a * (long)b > Integer.MAX_VALUE){
	            System.out.println("Overflow");
	            return -1;
	        }
	        return a*b;
	    }
	    public double multiply(double a, double b){
	        if((double)a * (double)b > Double.MAX_VALUE){
	            System.out.println("Overflow");
	            return -1;
	        }
	        return a*b;
	    }

}
