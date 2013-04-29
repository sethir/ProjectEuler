//Find the sum of even Fibonacci numbers below 4M
//Tim Skew 2013-04-26
import java.util.*;


public class Problem2 {
	public static void main(String[] args) {
		List<Integer> fibList = new ArrayList<Integer>();
		fibList.add(0);
		fibList.add(1);
		int listPointer = 0;
		int fibSum = 0;
		
		while (fibList.get(listPointer) < 4000000) {
			fibList.add(fibonacci(listPointer + 1));
			listPointer++;
		}

		System.out.println(listPointer);
		System.out.println(fibList.get(listPointer));

		for (int i = 0; i < listPointer; i++) {
			if (fibList.get(i) % 2 == 0) {
				fibSum += fibList.get(i);
			}
		}

		System.out.println("Answer: " + fibSum);
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;			
		}
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}