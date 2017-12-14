The0package com.codingiseasy;
/*The list of all natural numbers below 10 that are multiples of 3 or 5, are: 3, 5, 6 and 9.
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/
public class Multiples {
static int sum=0;
public static void function(int n){
	for(int i=1; i<n; i++) {
		if(i%3==0 || i%5==0) {
		
			sum=sum+i;
		}
	}

System.out.println(sum);

}
	public static void main(String[] args) {
		
		function(1000);
		

	}
}

The answer is: 233168
