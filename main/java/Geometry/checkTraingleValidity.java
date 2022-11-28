package Geometry;

public class checkTraingleValidity {
	public int checkValidity(int a, int b, int c)
    {
        // check condition
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }

}
