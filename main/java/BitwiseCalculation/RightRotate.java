package BitwiseCalculation;

public class RightRotate {
	 public static int rightRotate(int n, int d) {

	        return (n >> d) | (n << (32 - d));
	    }
}
