
public class Problem3 {

	// Create a mergeklists() to merge 3 sorted arrays into one sorted array
	// Input: 3 sorted arrays
	// Output: one sorted array that contains all the elements from input arrays
	// Complete the code here.
	public static int[] mergeklists(int[] l1, int[] l2, int[] l3, int size){
		//what i can do
		//go threw each array and pull out the smallest element and then put it into the new array
		//then do a recurrsive call to start over

		int[] arry = new int[size];
		int i = 0;
		int arry1 = 0;
		int arry2 = 0;
		int arry3 = 0;

		while (i <= size){
			
		}


		return arry;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] l1 = {1,5,9,10,20};

		int[] l2 = {2,4,5,6,7,9,15};

		int[] l3 = {3,8,13,15,22};

		// Required: Test your mergeklists() over l1, l2, l3,
		// Complete the code here.

		int size = l1.length + l2.length + l3.length;

		mergeklists(l1,l2,l3,size);




	}

}
