
public class BinarySearch {

	public static int binarySearch()
	{

		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int n=10;
		int l=0;
		int h=arr.length-1;
		int mid;
		
		while(l<=h)
		{
			
			mid=l+((h-l))/2;
			if(arr[mid]==n)
			{
				return mid;
			}
			else if (n<arr[mid])
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binarySearch());

	}

}
