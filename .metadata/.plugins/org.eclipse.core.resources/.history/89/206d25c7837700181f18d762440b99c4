package bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class EasyGoing {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t >= 1 && t <= 10) {
			for(int i = 0; i < t; i++) {
				int n = sc.nextInt();
				if(n >= 1 && n <= 1000) {
					int[] array = new int[n];
					int m = sc.nextInt();
					int no = n-m;
					for(int j = 0; j < n; j++) {
						int a = sc.nextInt();
						if(a >= 1 && a <= 1000) {
							array[j] = a;							
						}
					}
					int diff = findDifference(array, no);
					System.out.println(diff);
				}
			}
		}
		
	}

	private static int findDifference(int[] array, int no) {
		int max = 0;
		int min = 0;
		int size = array.length-1;
		Arrays.sort(array);
		
		for(int i = 0; i < no; i++) {
			min += array[i];
		}
		
		for(int i = size; i > size-no; i--) {
			max += array[i];
		}
		
		int diff = max - min;
		
		return diff;
	}
}
