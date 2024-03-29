package one2fifty;

import java.util.ArrayList;
import java.util.List;

/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Even_Fibonacci_Numbers__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> Fibonacci = new ArrayList<Integer>();
		long sum = 0;
		
		
		Fibonacci.add(1);
		Fibonacci.add(2);
		
		int i = 1;
		
		while(Fibonacci.get(i)<4000000) {
			i++;
			Fibonacci.add((Fibonacci.get(i-1))+(Fibonacci.get(i-2)));
			
		}
		
		System.out.println(Fibonacci.toString());
		
		for (double f : Fibonacci) {
			if(f%2 == 0) {
				sum+=f;
			}
		}
		
		System.out.println(sum);
		
	}

}
