package bubbleSort;

/*Monk and !Monk decided to play a simple number game. Each of them had a set of numbers 
(may contain a number more than once) to play with. Lets denote by A the set belonging 
to Monk, and by B, the set belonging to !Monk.*/

import java.util.Arrays;
import java.util.Scanner;

public class SimpleGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] monk = new int[N];
		int[] monk2 = new int[M];
		for(int i = 0; i < N; i++) {
			monk[i] = sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			monk2[i] = sc.nextInt();
		}

		findWinner(monk, monk2, N, M);
		sc.close();
	}

	private static void findWinner(int[] monk, int[] monk2, int n, int m) {

		long monkScore = 0;
		long monk2Score = 0;

		for(int i = 0; i < n; i++) {
			int fx = countGreater(monk[i], monk2, m, false);
			int gx = countGreater(monk[i], monk2, m, true);
			int vx = fx * gx;
			//System.out.println("Monk " + i + ": fx" + fx + " gx:" + gx + " vx:" + vx);
			monkScore += vx;
		}

		for(int i = 0; i < m; i++) {
			int fx = countGreater(monk2[i], monk, n, false);
			int gx = countGreater(monk2[i], monk, n, true);
			int vx = fx * gx;
			//System.out.println("Monk2 " + i + ": fx" + fx + " gx:" + gx + " vx:" + vx);
			monkScore += vx;
		}

		if(monkScore > monk2Score) {
			System.out.println("Monk " + (monkScore - monk2Score));
		} else if(monkScore < monk2Score) {
			System.out.println("!Monk " + (monk2Score - monkScore));
		} else {
			System.out.println("Tie");
		}

	}

	private static int countGreater(int x, int[] monk, int size, boolean greater) {
		Arrays.sort(monk);
		int countGreater = 0;
		int countSmaller = 0;
		int start = 0;
		int end = size - 1;
		int pointer = 0;
		while(start < end) {
			int mid = (start+end)/2;
			if(monk[mid] == x) {
				pointer = mid;
				break;
			} else if(monk[mid] > x) {
				end = mid - 1;
				pointer = end;
			}  else {
				start = mid + 1;
				pointer = start;
			}
		}
		if(pointer < 0) {
			pointer = 0;
		}
		if(greater) {
			for(int i = size-1; i >= pointer; i--) {
				//System.out.println("Greater: x::" + x + "  i::" + i + "pointer:: " + pointer);
				if(monk[i] > x) {
					countGreater++;
				}
			}
			
			return countGreater;
		} else {
			for(int i = 0; i <= pointer; i++) {
				//System.out.println("Smaller: x::" + x + "  i::" + i + "pointer:: " + pointer);
				if(monk[i] < x) {
					countSmaller++;
				}
			}
			return countSmaller;
		}
	}

}
