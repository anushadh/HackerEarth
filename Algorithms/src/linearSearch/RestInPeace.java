package linearSearch;

/*The grandest stage of all, Wrestlemania XXX recently happened. And with it, happened one of 
the biggest heartbreaks for the WWE fans around the world. The Undertaker's undefeated streak was finally over.

Now as an Undertaker fan, you're disappointed, disheartened and shattered to pieces. And 
Little Jhool doesn't want to upset you in any way possible. (After all you are his only friend, 
true friend!) Little Jhool knows that you're still sensitive to the loss, so he decides to help you out.

Every time you come across a number, Little Jhool carefully manipulates it. He doesn't want 
you to face numbers which have "21" as a part of them. Or, in the worst case possible, are divisible by 21.

If you end up facing such a number you feel sad... and no one wants that - because you start 
chanting "The streak is broken!" , if the number doesn't make you feel sad, you say, "The streak lives still in our heart!"

Help Little Jhool so that he can help you!

Input Format:
The first line contains a number, t, denoting the number of test cases.
After that, for t lines there is one number in every line.

Output Format:
Print the required string, depending on how the number will make you feel.
*/

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
