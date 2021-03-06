package linearSearch;

import java.util.Scanner;

/*Given A Series Of N Positive Integers a1,a2,a3........an. , Find The Minimum And 
 * Maximum Values That Can Be Calculated By Summing Exactly N-1 Of The N Integers. 
 * Then Print The Respective Minimum And Maximum Values As A Single Line Of Two Space-Separated Long Integers.

Input Format
First Line Take Input Value Of N
Second Line Take Input N Space Separated Integer Value

Output Format
Two Space Separated Value ( One Maximum Sum And One Minimum Sum )*/

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N > 0 && N < 100001) {
			int[] array = new int[N];
			int sum = 0;
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a > 0 && a < Math.pow(10, 13)) {
					array[i] = a;
					sum += array[i];
				}
			}
			int max = 0;
			int min = sum;
			for(int i = 0; i < N; i++) {
				int value = sum - array[i];
				min = Math.min(value, min);
				max = Math.max(max, value);
				/*if(value > max) {
					max = value;
				}
				if(value < min) {
					min = value;
				}*/
			}
			System.out.println(min + " " + max);
		}
	}
}
