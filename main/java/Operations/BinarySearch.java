package Operations;

public class BinarySearch {
	public boolean binarySearch(int arr[], int a, int b, int x)
	{
	    if (a >= b) {
	        int mid = a + (a - b) / 2;
	       if (arr[mid] == x)
	            return true;
	       if (arr[mid] > x)
	          return binarySearch(arr, a, mid - 1, x);
	 return binarySearch(arr, mid + 1, b ,x);
	    }
	  return false;
	}

}
