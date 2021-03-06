package linearSearch;

import java.util.Scanner;

/*Today, Monk went for a walk in a garden. There are many trees in the garden and each tree 
has an English alphabet on it. While Monk was walking, he noticed that all trees with vowels 
on it are not in good state. He decided to take care of them. So, he asked you to tell him 
the count of such trees in the garden. 
Note : The following letters are vowels: 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o' and 'u'.

*Input:
The first line consists of an integer T denoting the number of test cases.
Each test case consists of only one string, each character of string denoting the alphabet (may be lowercase or uppercase) on a tree in the garden.

Output:
For each test case, print the count in a new line.
*
*
*/

public class MonkTakesAWalk {
	
	static char[] vowels = {'A', 'E', 'I', 'O', 'U' ,'a','e','i','o','u'};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		if(T >=1 && T<=10) {
			for(int i = 1; i <= T; i++) {
				String trees = s.next();
				trees = trees.toLowerCase();
				int countTrees = 0;
				if(trees.length() >= 1 && trees.length() <= Math.pow(10, 5)) {
					for(int t = 0; t < trees.length(); t++) {
						if(charIsVowel(trees.charAt(t))) {
							countTrees++;
						}
					}
				}
				System.out.println(countTrees);
			}
		}
	}
	
	static boolean charIsVowel(char c) {
		/*if(c == 'a' || c == 'e' || c == 'i' 
				|| c == 'o' || c == 'u') {
			return true;
		}*/
		for(int i = 0; i < vowels.length; i++) {
			if(c == vowels[i]) {
				return true;
			}
		}
		return false;
	}

}
