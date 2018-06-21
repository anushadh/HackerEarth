package searching;

import java.util.Scanner;

public class RestInPeace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t>=1 && t<=100) {
			for(int i = 0; i < t; i++) {
				int n = sc.nextInt();
				if(n>=1 && n<=1000000) {
					String s = Integer.toString(n);
					boolean isContains21 = false;
					for(int j = 0; j < s.length()-1; j++) {
						if(s.charAt(j) == '2' && s.charAt(j+1) == '1') {
							isContains21 = true;
						}
					}
					if(n%21 == 0 || isContains21) {
						System.out.println("The streak is broken!");
					} else {
						System.out.println("The streak lives still in our heart!");
					}
				}
			}
		}
		
	}

}
