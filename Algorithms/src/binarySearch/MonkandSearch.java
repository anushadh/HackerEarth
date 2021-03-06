package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*Monk and his friend Micro are on a quest to find the answer of Life, Universe and Everything. 
 * In order to complete it they need to answer Q queries on an array A having N integers. 
 * The queries can be of following two types:
	O X: Find the number of numbers in A which are not less than x.
	 1 X: Find the number of numbers in A which are greater than x.
	Help them complete the quest and be back in time for the next Code Monk Challenge.

	Input Format:
	First line consists of a single integer denoting N.
	Second line consists of N space separated integers denoting the array A.
	Third line consists of a single integer denoting Q.
	Each of the following Q lines consists of a query of one of the given two types.

	Output Format: 
	For each query print the required answer in new line.*/

public class MonkandSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N >= 1 && N <= Math.pow(10, 5)) {
			int[] array = new int[N];
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a >= 1) {
					array[i] = a;	
				}
			}
			Arrays.sort(array);
			int Q = sc.nextInt();
			if(Q >= 1 && Q <= 3*(Math.pow(10, 5))) {
				for(int i = 0; i < Q; i++) {
					int type = sc.nextInt();
					int x = sc.nextInt();
					int count = 0;
					if(type == 0) {
						count = findNotLessThanX(array, x);
						System.out.println(count);
					} else if(type == 1) {
						count = findGreaterThanX(array, x);
						System.out.println(count);
					}
				}
			}
		}
	}

	private static int findGreaterThanX(int[] array, int x) {
		int start = 0;
		int end = array.length-1;
		int pointer = 0;
		while(start <= end) {
			int mid = (start+end)/2;
			if(x == array[mid]) {
				pointer = mid;
				break;
			}else if(x < array[mid]) {
				end = mid-1;
				pointer = end;
			} else {
				start = mid + 1;
				pointer = start;
			}
		}
		if(pointer < 0) {
			pointer = 0;
		}
		int count = 0;
		for(int i = array.length-1; i >= pointer; i--) {
			if(array[i] > x) {
				count++;
			}
		}
		
		return count;
	}

	private static int findNotLessThanX(int[] array, int x) {
		int start = 0;
		int end = array.length-1;
		int pointer = 0;
		while(start <= end) {
			int mid = (start+end)/2;
			if(x == array[mid]) {
				pointer = mid;
				end = mid-1;
			}else if(x < array[mid]) {
				end = mid-1;
				pointer = end;
			} else {
				start = mid + 1;
				pointer = start;
			}
		}
		if(pointer < 0) {
			pointer = 0;
		}
		int count = 0;
		for(int i = array.length-1; i >= pointer; i--) {
			if(array[i] >= x) {
				count++;
			}
		}
		
		return count;
	}

}
