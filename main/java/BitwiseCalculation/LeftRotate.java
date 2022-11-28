package BitwiseCalculation;

public class LeftRotate {
	public  int leftRotate(int n, int d) {

        
        return (n << d) | (n >> (32 - d));
    }

}
