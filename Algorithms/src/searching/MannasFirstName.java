package searching;

import java.util.Scanner;

/*Manna is extremely disappointed to find out that no one in his college knows his first name. 
Even his classmates call him only by his last name. Frustrated, he decides to make his fellow 
college students know his first name by forcing them to solve this question.

You are given a long string as input in each testcase, containing any ASCII character. 
Your task is to find out the number of times SUVO and SUVOJIT appears in it.

Note: This problem must be solved in C language only.

Input Format
The first line contains the number of testcases, T. Next, T lines follow each containing a long string S.

Output Format
For each long string S, display the no. of times SUVO and SUVOJIT appears in it.
*/
public class MannasFirstName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T >=1 && T <= 100) {
			for(int i = 0; i < T; i++) {
				String S = sc.next();
				int suvo = 0, suvojit = 0;
				for(int j = 0; j < S.length(); j++) {
							
					System.out.println("SUVO = " + suvo + ", " + "SUVOJIT = " + suvojit);
				}
			}
		}
	}

}
