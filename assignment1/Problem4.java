
public class Problem4 {

	public static void partition(int[] A)
	{
		//for loop
		//check each element of the arry agaisnt the first and put the smaller ones before it
		//covert to an alist
		//convert it back
		//start with the basics
		//a new array to hold the values
		//pointers to everything else
		int[] arry = new int[A.length];
		int hold = A[0];
		int start = 0;
		int end = A.length - 1;
		for (int i = 1; i < A.length; i++){
			//if item is smaller than first element
			//put it in front of the first element
			//and move the first element back one
			if (A[i] < hold){
				arry[start] = A[i];
				start++;
				arry[start] = hold;
			//although if it is larger
			//put that element at the end
			} else {
				arry[end] = A[i];
				end--;
			}
		}
		//do some fancy smancy array coping tech
		System.arraycopy(arry, 0, A, 0, arry.length);
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
