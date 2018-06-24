package bubbleSort;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TheBestPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		if(t>=1 && t<=n && n>=1 && n<=1000) {
			Map<String, Integer> fans = new HashMap<>();
			for(int i = 0; i < n; i++) {
				String fan = sc.next(); 
				int quotient = sc.nextInt();
				int length = fan.length()-1;
				if(length >= 1 && length <= 20 && quotient >= 1 && quotient <= Math.pow(10, 9)) {
					fans.put(fan, quotient);
				}
			}
			System.out.println(fans.toString());
			findFans(fans, t);		
		}
		sc.close();
	}

	private static void findFans(Map<String, Integer> fans, int t) {
		String[] finalList = new String[t];
		for(Entry<String, Integer> e : fans.entrySet()) {
			
		}
		
	}

}
