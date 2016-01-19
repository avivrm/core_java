package com.program.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class SmallFactorial {
	public static void main(String... strings) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			Integer s = Integer.parseInt(br.readLine());
			BigInteger fact = BigInteger.ONE;
			for(int i=1;i<=s;i++){
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
		}
	}
}
