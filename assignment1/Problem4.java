
public class Problem4 {

	public static void partition(int[] A)
	{
		//for loop
		//check each element of the arry agaisnt the first and put the smaller ones before it
		//covert to an alist
		//convert it back
		System.out.println(A.toString());
		int[] arry = A;
		int hold = A[0];
		int start = 0;
		int end = A.length - 1;
		for (int i = 1; i < A.length; i++){
			System.out.println(arry[i]);
			if (arry[i] < hold){
				A[start] = arry[i];
				start++;
				A[start] = hold;
			} else {
				A[end] = arry[i];
				end--;
			}
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] A = {4,3,9,2,7,6,5};

		System.out.println("Before partition:");
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + " ");

		}

		partition(A);

		System.out.println("\nAfter partition:");

		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + " ");

		}



	}

}
