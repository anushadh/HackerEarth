package linearSearch;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*Input:
First line contains an integer N and then N lines follow with a message S in the following format in each line.
[G/M]: 
eg. G: Hi 
[G means that it is Girlfriends message and M means that it is Menot�s message]
Note: Everything is space separated and the days will be integers with no leading zeroes and will always be preceded by a space]

Output : Print �Date� if the decided day is 19 or 20 otherwise print �No Date�.
Note: If multiple days have same weightage the date is cancelled and you must output �No Date�*/
public class BreakupApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> dates = new HashMap<>();
		if(N >=1 && N <= 1000) {
			for(int i = 0; i < N; i++) {
				String S = sc.nextLine();
				int length = S.length(); 
				if(length >= 2 && length <= 1000) {
					String date = "";
					for(int s = 0; s < length; s++) {						
						if(Character.isDigit(S.charAt(s))) {
							date += S.charAt(s);
							int datei = Integer.parseInt(date);
							if(date.length() > 1) {  //Considers only dates in double digits
								if(dates.containsKey(datei)) {
									int value = dates.get(datei);
									if(S.charAt(0) == 'G') {																				
										dates.put(datei, value+2);
									} else {
										dates.put(datei, value+1);
									}
								} else {
									if(S.charAt(0) == 'G') {
										dates.put(datei, 2);
									} else {
										dates.put(datei, 1);
									}
								}
								date = "";
							}
						}
					}
				}
			}
		}
		boolean dateFlag = false;
		int maxWeightage = 0;
		for(Entry<Integer, Integer> e : dates.entrySet()) {
			if(e.getValue() > maxWeightage) {
				maxWeightage = e.getValue(); 
			}
		}
		for(Entry<Integer, Integer> e : dates.entrySet()) {
			if(e.getValue() == maxWeightage) {
				if(e.getKey() == 19 || e.getKey() == 20) {
					dateFlag = true;
				}
			}
		}
		if(dateFlag) {
			System.out.println("Date");
		} else {
			System.out.println("No Date");
		}
		sc.close();
	}

}
