
public class Problem3 {

	public static double findmaxdiff(double[] A){
		// Complete the method to find the maximum difference of a given array A

		int spot1 = 0;
		int spot2 = 0;
		int diff = 0;

		for(int i = 0; i < A.length; i++){
			int j = i + 1;
			if (j < A.length){
				if (A[i] < A[j]){
					if(A[j] - A[i] > diff){
						spot1 = i;
						spot2 = j;
						diff = A[j] - A[i];
					}

				} else {
					j++;
				}
			}
		}

		return diff;


	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your findmaxdiff() method here

		double[] testarray1 = {2, 3, 10, 6, 4, 8, 1};
		// maxdiff: 8

		double[] testarray2 = {7, 9, 5, 6, 3, 2};
		// maxdiff: 2

		System.out.println("The maxdiff is " + findmaxdiff(testarray1));

		System.out.println("The maxdiff of testarray2 is " + findmaxdiff(testarray2));






	}

}
