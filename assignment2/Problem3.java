
public class Problem3 {

	// Create a mergeklists() to merge 3 sorted arrays into one sorted array
	// Input: 3 sorted arrays
	// Output: one sorted array that contains all the elements from input arrays
	// Complete the code here.
	public static int[] mergeklists(int[] l1, int[] l2, int[] l3, int size){
		//what i can do
		//put everything into one array using a for loop
		//then bubble sort it
		//BUBBLES
		int[] arry = new int[size];
		int temp = 0;
		int i = 0;
		while (temp < size){
			if (i < l1.length-1){
				arry[temp] = l1[i];
				temp++;
			}
			if (i < l2.length-1){
				arry[temp] = l2[i];
				temp++;
			}
			if (i < l3.length-1){
				arry[temp] = l3[i];
				temp++;
			}
			i++;
		}
		//BUBBLES
		boolean bubble = true;
		int bub = 0;
		while (bubble){
			bubble = false;
			for (int j = 0; j < size - 1; j++){
				if (arry[j] > arry[j+1]){
					bub = arry[j];
					arry[j] = arry[j+1];
					arry[j+1] = bub;
					bubble = true;
				}
			}
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

		int size = (l1.length -1) + (l2.length -1) + (l3.length -1);

		int[] arry = 	mergeklists(l1,l2,l3,size);

		for (int i = 0; i < size; i++){
			System.out.println(arry[i]);
		}
	}

}
