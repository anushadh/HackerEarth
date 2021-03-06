package binarySearch;

import java.util.Arrays;

/*Bishu went to fight for Coding Club. There were N soldiers with various powers. 
There will be Q rounds to fight and in each round Bishu's power will be varied. 
With power M, Bishu can kill all the soldiers whose power is less than or equal 
to M(<=M). After each round, All the soldiers who are dead in previous round 
will reborn.Such that in each round there will be N soldiers to fight. 
As Bishu is weak in mathematics, help him to count the number of soldiers that 
he can kill in each round and total sum of their powers.

1<=N<=10000

1<=power of each soldier<=100

1<=Q<=10000

1<=power of bishu<=100*/

import java.util.Scanner;

public class BishuandSoldiers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N >=1 && N <= 10000) {
			int[] soldiers = new int[N];
			for(int i = 0; i < N; i++) {
				int p = sc.nextInt();
				if(p >= 1 && p <= 100) {
					soldiers[i] = p;
				}
			}
			int Q = sc.nextInt();
			if(Q >= 1 && Q <= 10000) {
				for(int i = 0; i < Q; i++) {
					int b = sc.nextInt();
					if(b >= 1 && b <= 100) {
						findPowerOfBishu(soldiers, N, b);
					}
				}
			}
		}
		sc.close();
	}

	/*//Using loop - linear search
	private static void findPowerOfBishu(int[] soldiers, int n, int bishuPower) {
		int countOfSoldiers = 0;
		int totalPower = 0;

		for(int i = 0; i < n; i++) {
			if(soldiers[i] <= bishuPower) {
				countOfSoldiers++;
				totalPower += soldiers[i];
			}
		}

		System.out.println(countOfSoldiers + " " + totalPower);
	}*/

	//Using binary search
	private static void findPowerOfBishu(int[] soldiers, int n, int bishuPower) {
		Arrays.sort(soldiers);
		
		int countOfSoldiers = 0;
		int totalPower = 0;
		int start = 0, end = n-1;
		int pointer = 0;
		while(start <= end) {
			int mid = (start+end)/2;
			if(start == end) {
				pointer = end;
				break;
			} else
			if(soldiers[mid] > bishuPower) {
				end = mid - 1;
				pointer = end;
			} else if(soldiers[mid] < bishuPower) {
				start = mid + 1;
				pointer = start;
			} else {
				pointer = mid;
				break;
			}			
		}
		System.out.println("pointer:: " + pointer);
		for(int i = 0; i <= pointer; i++) {
			if(soldiers[i] <= bishuPower) {
				countOfSoldiers++;
				totalPower += soldiers[i];
			}
		}

		System.out.println(countOfSoldiers + " " + totalPower);
	}

}
