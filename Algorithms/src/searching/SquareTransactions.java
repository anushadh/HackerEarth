package searching;

import java.util.Scanner;

public class SquareTransactions {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] transactions = new int[T];
		long[] totals = new long[T];
		int sum = 0;
		if(T>=1 && T<=100000) {
			for(int t = 0; t<T; t++) {
				int a = sc.nextInt();
				if(a>=1 && a<=1000) {
					transactions[t] = a;
					sum += transactions[t];
					totals[t] = sum;
				}				
			}
			int Q = sc.nextInt();
			if(Q>=1 && Q<=1000000) {
				for(int q = 0; q < Q; q++) {
					int output = -1;
					int target = sc.nextInt();
					for(int i = 0; i < T; i++) {
						if(totals[i] == target) {
							output = i+1;
							break;
						} else if(totals[i] < target) {
							continue;
						} else {
							output = i+1;
							break;
						}
					}
					System.out.println(output);
				}
			}
			
		}
		
		/*Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] transactions = new int[T];
		if(T>=1 && T<=100000) {
			for(int t = 0; t<T; t++) {
				int a = sc.nextInt();
				if(a>=1 && a<=1000) {
					transactions[t] = a;
				}				
			}
			int Q = sc.nextInt();
			if(Q>=1 && Q<=1000000) {
				for(int q = 0; q < Q; q++) {
					int output = -1;
					int sum = 0;
					int target = sc.nextInt();
					for(int i = 0; i < T; i++) {
						sum += transactions[i];
						if(sum >= target) {
							output = i+1;
							break;
						} 
					}
					System.out.println(output);
				}
			}
			
		}*/
		
	}
}
