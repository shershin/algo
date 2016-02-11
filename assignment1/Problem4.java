
public class Problem4 {

	public static void partition(int[] A)
	{
		//for loop
		//check each element of the arry agaisnt the first and put the smaller ones before it
		//covert to an alist
		//convert it back
		int[] holder = A[];
		for (int i = 1; i < A.length - 1; i++){
			if (holder[i] < holder[0]){
				A[i-1] = holder[i];

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

		System.out.println("After partition:");

		System.out.println("Before partition:");
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + " ");

		}



	}

}
