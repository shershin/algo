
public class Problem3 {

	public static boolean checksum(int[] A, int t)
	{
		/*
Input: an array, A, of n integers (positive, negative, or 0), and an integer value t.
Output: yes if there exist three indices i, j and k, with 0 = i < j < k = n-1, such
that A[i] + A[j] + A[k] = t, and no otherwise.
		 */
		 /*/
		 take in the arry
		 get the length of said arry
		 then create a sum of all items to see if it matches random int
		 init all the things
		 for loop
		 then if statement
		 /*/
		 System.out.println(A.length);
		 for (int i = 0; i < A.length - 1 ; i++){
			 //check for the first number
			 for (int j = 0; j < A.length - 1; j++){
				 //check for the second number
				 for(int k = 0; k < A.length - 1; k++){
					 //check for the final number
					 if ((A[i] + A[j] + A[k]) == t){
						 //if there is 3 numbers that == t then return true
						 //but if there isnt return false at the end of the forloops
						 return true;
					 }
					 }
				 }
			 }
			 return false;
		 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your checksum method

		int[] A = {28, -70, -23, 92, 56, -33, -77};
		int t = -47;
		System.out.println("There exist three indices i, j and k, such that A[i] + A[j] + A[k] = " + t + " : " + checksum(A,t));

		// Required: Please test your method with a different array and t, you can make up an array, and t

		// Complete the code here.

		//my own tester goes here i guess
		int[] test = {0, 99, 1, -99, 2055, 5};
		int sum = 100;

		System.out.println("Return true if true " + checksum(test,sum));






	}

}
