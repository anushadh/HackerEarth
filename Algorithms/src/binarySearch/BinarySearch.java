package binarySearch;

import java.util.Arrays;
import java.util.Collections;

/*You have been given an array A consisting of N integers. All the elements 
in this array A are unique. You have to answer some queries based on the elements 
of this array. Each query will consist of a single integer x. You need to print 
the rank based position of this element in this array considering that the array is 
1 indexed. The rank based position of an element in an array is its position in 
the array when the array has been sorted in ascending order.

Note: It is guaranteed that all the elements in this array are unique and for 
each x belonging to a query, value x shall exist in the array

Input Format

The first line consists of a single integer N denoting the size of array A. 
The next line contains N unique integers, denoting the content of array A. The next 
line contains a single integer q denoting the number of queries. Each of the next q 
lines contains a single integer x denoting the element whose rank based position needs to be printed.

Output Format

You need to print q integers denoting the answer to each query.*/

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N >= 1 && N <= Math.pow(10, 5)) {
			int[] array = new int[N];
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a >= 1 && a <= Math.pow(10, 9)) {
					array[i] = a;
				}
			}
			Arrays.sort(array);
			int q = sc.nextInt();
			if(q >= 1 && q <= Math.pow(10, 5)) {
				for(int i = 0; i < q; i++) {
					int x = sc.nextInt();
					if(x >= 1 && x <= Math.pow(10, 9)) {
						int rank = findRank(array, N, x);
						System.out.println(rank);
					}
				}
			}
		}

		sc.close();
	}

	private static int findRank(int[] array, int n, int x) {
		int start = 0, end = n-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(array[mid] == x) {
				return mid+1;
			} else if(array[mid] > x) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

}
