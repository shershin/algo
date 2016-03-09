
public class Problem6 {

	public static double f(int n )
	{
		// f(n) = 1  if n = 0
		// f(n) = 1 + 1 / f(n-1)  if n > 0
		// Complete the code here to make a recursive method to calculate f(n)

		double results = 0;
		if (n > 0){
			results = 1 + (1 / f(n-1));
		} else {
			results = 1;
		}
		return results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 1, n2 = 10;

		// Required: Test your f() when n = 1, and when n = 10,
		// Complete the code here.

		System.out.println("f(" + n1 + ") = " + f(n1));
		System.out.println("f(" + n2 + ") = " + f(n2));



	}

}
