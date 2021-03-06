package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*You are given an array A of size N, and Q queries to deal with. For each query, 
you are given an integer X, and you're supposed to find out if X is present in the array A or not.

Input:
The first line contains two integers, N and Q, denoting the size of array A and 
number of queries. The second line contains N space separated integers, denoting
the array of elements Ai. The next Q lines contain a single integer X per line.

Output:
For each query, print YES if the X is in the array, otherwise print NO.
*/
public class DiscovertheMonk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		if(N >= 1 && Q<= Math.pow(10, 5)) {
			int[] array = new int[N];
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a >= 1 && a <= Math.pow(10, 9)) {
					array[i] = a;
				}
			}
			Arrays.sort(array);
			for(int i = 0; i < Q; i++) {
				int X = sc.nextInt();
				if(X >= 1 && X <= Math.pow(10, 9)) {
					String isXFound = findXInArray(array, X);
					System.out.println(isXFound);
				}
			}
		}
		sc.close();

	}
	/* if we first sort the array which will take O(NlogN) and then apply binary search for each 
	 query then the total time will be O(QlogN + NlogN) which is indeed better than O(NQ) - Linear.*/
	private static String findXInArray(int[] array, int x) {
		int start = 0;
		int end = array.length - 1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(array[mid] == x) {
				return "YES";
			}else if(array[mid] < x) {
				start = mid+1;
			} else if(array[mid] > x) {
				end = mid-1;
			} 
		}
		return "NO";
	}


}
