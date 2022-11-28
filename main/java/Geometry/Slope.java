package Geometry;

public class Slope {
	public static float slope(float x1, float y1, float x2,
            float y2)
	{
		if (x2 - x1 != 0)
		 return (y2 - y1) / (x2 - x1);
		return Integer.MAX_VALUE;
	}

	public Double slope(double d, double e) {
		// TODO Auto-generated method stub
		return null;
	}

}
