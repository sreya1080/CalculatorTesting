package BitwiseCalculation;

public class countSetBits {
	public static int countSetBits(int n)
    {
       
 //hi
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
      
    }


}
