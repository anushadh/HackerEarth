package linearSearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
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
		//O(N log N)
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
			Arrays.sort(array);
			
			int k = sc.nextInt();
			int temp = 100001+1;
			if(k >=1 && k <= 100001) {
				int i = 0;
				while(i < N) {
					for(int j = i+1; j < N; j++) {
						int count = 1;
						if(array[i] == array[j]) {
							count++;
						}
						if(count == k) {
							temp = Integer.min(array[i], temp);
						}
					}
					i++;
				}
			}
			System.out.println(temp);
			sc.close();
		}
			//Using map O(N)
		/*Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N >=1 && N <= 100001) {
			Map<Integer, Integer> integer = new HashMap<>();
			int[] array = new int[N];
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a >=1 && a <= 100001) {
					array[i] = a;
					if(integer.containsKey(a)) {
						int value = integer.get(a);
						integer.put(a, value+1);
					} else {
						integer.put(a, 1);
					}
				}
			}			
			int k = sc.nextInt();
			int temp = Integer.MAX_VALUE;
			if(k >=1 && k <= 100001) {
				for(Entry<Integer, Integer> e : integer.entrySet()) {
					if(e.getValue() == k) {
						if(e.getKey() < temp) {
							temp = e.getKey();
						}
					}
				}
			}
			System.out.println(temp);
			sc.close();
		}*/
		
		
	}

}
