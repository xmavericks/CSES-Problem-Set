import java.util.*;
/*
https://cses.fi/problemset/task/1083
*/

class MissingNumber { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			long temp = sc.nextInt();
			sum += temp;
		}
		long missingNumber = ((long)n*(n+1))/2 - sum;
		System.out.println(missingNumber);
	}
}
