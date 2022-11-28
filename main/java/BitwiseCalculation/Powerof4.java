package BitwiseCalculation;

public class Powerof4 {
	public static int isPowerOfFour(int n)
    {
        int count = 0;

        int x = n & (n - 1);

        if ( n > 0 && x == 0)
        {
            
            while(n > 1)
            {
                n >>= 1;
                count += 1;
            }

            
            return (count % 2 == 0) ? 1 : 0;
        }

            /* If there are more than
            1 bit set then n is not a
            power of 4*/
        return 0;
    }

	public Integer nextPowerOf4(int i) {
		// TODO Auto-generated method stub
		return null;
	}}