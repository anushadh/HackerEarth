package searching;

import java.util.Scanner;

/*Given a List of N number a1,a2,a3........an, You have to find smallest 
number from the List that is repeated in the List exactly K number of times.

Input Format

First Line of Input Contain Single Value N, Size of List
Second Line of Input Contain N Space Separated Integers
Third Line of Input Contain Single Value K

Output Format

Smallest Integer Value That is Repeated Exactly K Number of Time*/

public class RepeatedKTimes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N >=1 && N <= 100001) {
			int[] array = new int[N];
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a >=1 && a <= 100001) {
					array[i] = a;
				}
			}
			int k = sc.nextInt();
			if(k >=1 && k <= 100001) {
				int count = 0;
				for(int i = 0; i < N; i++) {
					if()
				}
			}
		}
	}

}
