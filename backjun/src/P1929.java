

import java.util.ArrayList;
import java.util.Scanner;

public class P1929 {

	static boolean ans;
	
	static boolean isPrimeNum(int num) {
		for (int j = 2; j <= num; j++) {
			if (j == num) {
				ans = true;
			}
			else if (num % j == 0) {
				ans = false;
				break;
			}
		}
		return ans;
	}
	
	static void run() {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		
		for (int i = startNum; i <= endNum; i++) {
			boolean ans = isPrimeNum(i);
			if (ans == true) {
				primeList.add(i);
			}
		}
		
		for (Integer integer : primeList) {
			System.out.println(integer);
		}
	}

	public static void main(String[] args) {
		run();
	}
}