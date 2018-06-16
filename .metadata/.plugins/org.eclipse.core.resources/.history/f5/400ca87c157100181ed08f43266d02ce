package searching;

import java.util.Scanner;

/*Given a List of Distinct N number a1,a2,a3........an.
Find The Position Of Number K In The Given List.
Input Format
First Line Take Input Value Of N
Second Line Take Input N Space Separated Integer Value
Third Line Take Input Value Of K
Output Format
Position Of K In The Given List*/

public class SimpleSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N > 0 && N < 100001) {
			int[] array = new int[N];
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a > 0 && a < Math.pow(10, 10)) {
					array[i] = a;
				}
			}
			int k = sc.nextInt();
			if(k > 0 && k < Math.pow(10, 10)) {
				for(int i = 0; i < N; i++) {
					if(k == array[i] ) {
						System.out.println(i);
					}
				}
			}
		}
	}

}
